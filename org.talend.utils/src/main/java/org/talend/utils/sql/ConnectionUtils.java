// ============================================================================
//
// Copyright (C) 2006-2010 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.utils.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.talend.utils.sugars.ReturnCode;

/**
 * Utility class for database connection handling.
 */
public final class ConnectionUtils {

    private static Logger log = Logger.getLogger(ConnectionUtils.class);
    private static List<String> sybaseDBProductsNames;

    public static final String IBM_DB2_ZOS_PRODUCT_NAME = "DB2";

    public static final String SYBASE_LANGUAGE = "Adaptive Server Enterprise | Sybase Adaptive Server IQ";
    /**
     * The query to execute in order to verify the connection.
     */
    // private static final String PING_SELECT = "SELECT 1";
    /**
     * private constructor.
     */
    private ConnectionUtils() {
    }

    /**
     * Method "createConnection".
     * 
     * @param url the database url
     * @param driverClassName the Driver classname
     * @param props properties passed to the driver manager for getting the connection (normally at least a "user" and
     * "password" property should be included)
     * @return the connection
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    public static Connection createConnection(String url, String driverClassName, Properties props) throws SQLException,
            InstantiationException, IllegalAccessException, ClassNotFoundException {
        Driver driver = (Driver) Class.forName(driverClassName).newInstance();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(url, props);
        return connection;
    }

    /**
     * 
     * zshen Method "createConnection".
     * 
     * @param url the database url
     * @param driver Driver of database and can't be null
     * @param props properties passed to the driver manager for getting the connection (normally at least a "user" and
     * "password" property should be included)
     * @return the connection,it is can be null when the driver is null
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    public static Connection createConnection(String url, Driver driver, Properties props) throws SQLException,
            InstantiationException, IllegalAccessException, ClassNotFoundException {
        Connection connection = null;
        if (driver != null) {
            connection = driver.connect(url, props);
        }
        return connection;
    }

    /**
     * Method "isValid".
     * 
     * @param connection the connection to test
     * @return a return code with the appropriate message (never null)
     */
    public static ReturnCode isValid(final Connection connection) {
        ReturnCode retCode = new ReturnCode();
        if (connection == null) {
            retCode.setReturnCode("Connection is null!", false);
            return retCode;
        }

        ResultSet ping = null;
        try {
            if (connection.isClosed()) {
                retCode.setReturnCode("Connection is closed", false);
                return retCode;
            }

            // do something so that exception is thrown is database connection failed
            connection.getAutoCommit();

            // select 1 is not understood by Oracle => do not use it
            // ping = connection.createStatement().executeQuery(PING_SELECT);
            // boolean next = ping.next();
            // if (!next) {
            // retCode.setReturnCode("Problem executing query " + PING_SELECT, next);
            // return retCode;
            // }
            // if we are here, everything is ok
            return retCode;
        } catch (SQLException sqle) {
            retCode.setReturnCode("SQLException caught:" + sqle.getMessage() + " SQL error code: " + sqle.getErrorCode(), false);
            return retCode;
        } finally {
            if (ping != null) {
                try {
                    ping.close();
                } catch (Exception e) {
                    // do nothing
                }
            }
        }

    }

    /**
     * Method "closeConnection".
     * 
     * @param connection the connection to close.
     * @return a ReturnCode with true if ok, false if problem. {@link ReturnCode#getMessage()} gives the error message
     * when there is a problem.
     */
    public static ReturnCode closeConnection(final Connection connection) {
        assert connection != null;
        ReturnCode rc = new ReturnCode(true);
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            rc.setReturnCode("Failed to close connection. Reason: " + e.getMessage(), false);
        }
        return rc;
    }

    /**
     * DOC zshen Comment method "isSybase".
     * 
     * @param connection
     * @return decide to whether is sybase connection
     * @throws SQLException
     */
    public static boolean isSybase(java.sql.Connection connection) throws SQLException {
        // DatabaseMetaData connectionMetadata = getConnectionMetadata(connection);
        DatabaseMetaData connectionMetadata = connection.getMetaData();
        if (connectionMetadata.getDriverName() != null && connectionMetadata.getDatabaseProductName() != null) {
            for (String keyString : getSybaseDBProductsName()) {
                if (keyString.equals(connectionMetadata.getDatabaseProductName().trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * DOC xqliu Comment method "getConnectionMetadata". 2009-07-13 bug 7888.
     * 
     * @param conn
     * @return
     * @throws SQLException
     */

    public static DatabaseMetaData getConnectionMetadata(java.sql.Connection conn) throws SQLException {
        DatabaseMetaData dbMetaData = conn.getMetaData();
        // MOD xqliu 2009-11-17 bug 7888
        if (dbMetaData != null && dbMetaData.getDatabaseProductName() != null
                && dbMetaData.getDatabaseProductName().equals(IBM_DB2_ZOS_PRODUCT_NAME)) {
            dbMetaData = conn.getMetaData();
            log.info("IBM DB2 for z/OS");
        }
        // ~
        return dbMetaData;
    }

    /**
     * yyi 2010-08-25 for 14851, Sybase DB has several names with different productions and versions. For example the
     * Sybase IQ with version 12.6 is called 'Sybase' getting by JDBC but the version 15+ it is changed to 'Sybase IQ'.
     * it is user by org.talend.cwm.db.connection.ConnectionUtils.isSybase
     * 
     * @return All Sybase DB products name ,"Adaptive Server Enterprise","Sybase Adaptive Server IQ"
     * ,"Sybase IQ","Sybase"
     */
    public static String[] getSybaseDBProductsName() {
        if (null == sybaseDBProductsNames) {
            sybaseDBProductsNames = new ArrayList<String>();
            for (String name : SYBASE_LANGUAGE.split("\\|")) {
                sybaseDBProductsNames.add(name.trim());
            }
            sybaseDBProductsNames.add("Sybase");
            sybaseDBProductsNames.add("Sybase IQ");
            sybaseDBProductsNames.add("Adaptive Server Enterprise | Sybase Adaptive Server IQ");
        }
        return sybaseDBProductsNames.toArray(new String[sybaseDBProductsNames.size()]);
    }

    /**
     * only for db2 on z/os right now. 2009-07-13 bug 7888.
     * 
     * @param conn2
     * @return
     */
    // private static DatabaseMetaData createFakeDatabaseMetaData(java.sql.Connection conn) {
    // DB2ForZosDataBaseMetadata dmd = new DB2ForZosDataBaseMetadata(conn);
    // return dmd;
    // }
}
