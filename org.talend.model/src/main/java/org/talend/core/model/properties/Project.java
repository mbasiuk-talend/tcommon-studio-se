/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Project</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.Project#getTechnicalStatus <em>Technical Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getDocumentationStatus <em>Documentation Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getTechnicalLabel <em>Technical Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#isLocal <em>Local</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getFolders <em>Folders</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getDeleteDate <em>Delete Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getUserAuthorization <em>User Authorization</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getAllowedComponents <em>Allowed Components</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getReferencedProjects <em>Referenced Projects</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getAvailableRefProject <em>Available Ref Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getMigrationTasks <em>Migration Tasks</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getMasterJobId <em>Master Job Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getSpagoBiServer <em>Spago Bi Server</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Project#getComponentsSettings <em>Components Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {

    /**
     * Returns the value of the '<em><b>Technical Status</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.Status}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Technical Status</em>' containment reference list isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Technical Status</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_TechnicalStatus()
     * @model type="org.talend.core.model.properties.Status" containment="true"
     * @generated
     */
    EList getTechnicalStatus();

    /**
     * Returns the value of the '<em><b>Documentation Status</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.Status}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation Status</em>' containment reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation Status</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_DocumentationStatus()
     * @model type="org.talend.core.model.properties.Status" containment="true"
     * @generated
     */
    EList getDocumentationStatus();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_Label()
     * @model required="true"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_Description()
     * @model unique="false" required="true"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Language</em>' attribute.
     * @see #setLanguage(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_Language()
     * @model unique="false" required="true"
     * @generated
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' attribute.
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(String value);

    /**
     * Returns the value of the '<em><b>Author</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Author</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Author</em>' reference.
     * @see #setAuthor(User)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_Author()
     * @model
     * @generated
     */
    User getAuthor();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getAuthor <em>Author</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Author</em>' reference.
     * @see #getAuthor()
     * @generated
     */
    void setAuthor(User value);

    /**
     * Returns the value of the '<em><b>User Authorization</b></em>' reference list.
     * The list contents are of type {@link org.talend.core.model.properties.UserProjectAuthorization}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.UserProjectAuthorization#getProject <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Authorization</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Authorization</em>' reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_UserAuthorization()
     * @see org.talend.core.model.properties.UserProjectAuthorization#getProject
     * @model type="org.talend.core.model.properties.UserProjectAuthorization" opposite="project" ordered="false"
     * @generated
     */
    EList getUserAuthorization();

    /**
     * Returns the value of the '<em><b>Allowed Components</b></em>' reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ProjectComponentAuthorisation}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.ProjectComponentAuthorisation#getProject <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allowed Components</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allowed Components</em>' reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_AllowedComponents()
     * @see org.talend.core.model.properties.ProjectComponentAuthorisation#getProject
     * @model type="org.talend.core.model.properties.ProjectComponentAuthorisation" opposite="project" ordered="false"
     * @generated
     */
    EList getAllowedComponents();

    /**
     * Returns the value of the '<em><b>Referenced Projects</b></em>' reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ProjectReference}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.ProjectReference#getProject <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Projects</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Projects</em>' reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_ReferencedProjects()
     * @see org.talend.core.model.properties.ProjectReference#getProject
     * @model type="org.talend.core.model.properties.ProjectReference" opposite="project" ordered="false"
     * @generated
     */
    EList getReferencedProjects();

    /**
     * Returns the value of the '<em><b>Available Ref Project</b></em>' reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ProjectReference}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.ProjectReference#getReferencedProject <em>Referenced Project</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Available Ref Project</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Available Ref Project</em>' reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_AvailableRefProject()
     * @see org.talend.core.model.properties.ProjectReference#getReferencedProject
     * @model type="org.talend.core.model.properties.ProjectReference" opposite="referencedProject" ordered="false"
     * @generated
     */
    EList getAvailableRefProject();

    /**
     * Returns the value of the '<em><b>Migration Tasks</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Migration Tasks</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Migration Tasks</em>' attribute list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_MigrationTasks()
     * @model ordered="false"
     * @generated
     */
    EList getMigrationTasks();

    /**
     * Returns the value of the '<em><b>Master Job Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Master Job Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Master Job Id</em>' attribute.
     * @see #setMasterJobId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_MasterJobId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getMasterJobId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getMasterJobId <em>Master Job Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Master Job Id</em>' attribute.
     * @see #getMasterJobId()
     * @generated
     */
    void setMasterJobId(String value);

    /**
     * Returns the value of the '<em><b>Spago Bi Server</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.SpagoBiServer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spago Bi Server</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spago Bi Server</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_SpagoBiServer()
     * @model type="org.talend.core.model.properties.SpagoBiServer" containment="true" ordered="false"
     * @generated
     */
    EList getSpagoBiServer();

    /**
     * Returns the value of the '<em><b>Product Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Product Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Product Version</em>' attribute.
     * @see #setProductVersion(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_ProductVersion()
     * @model
     * @generated
     */
    String getProductVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getProductVersion <em>Product Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Product Version</em>' attribute.
     * @see #getProductVersion()
     * @generated
     */
    void setProductVersion(String value);

    /**
     * Returns the value of the '<em><b>Components Settings</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ComponentSetting}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Components Settings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Components Settings</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_ComponentsSettings()
     * @model type="org.talend.core.model.properties.ComponentSetting" containment="true" ordered="false"
     * @generated
     */
    EList getComponentsSettings();

    /**
     * Returns the value of the '<em><b>Technical Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Technical Label</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Technical Label</em>' attribute.
     * @see #setTechnicalLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_TechnicalLabel()
     * @model required="true"
     * @generated
     */
    String getTechnicalLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getTechnicalLabel <em>Technical Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Technical Label</em>' attribute.
     * @see #getTechnicalLabel()
     * @generated
     */
    void setTechnicalLabel(String value);

    /**
     * Returns the value of the '<em><b>Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local</em>' attribute.
     * @see #setLocal(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_Local()
     * @model unique="false" required="true"
     * @generated
     */
    boolean isLocal();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#isLocal <em>Local</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Local</em>' attribute.
     * @see #isLocal()
     * @generated
     */
    void setLocal(boolean value);

    /**
     * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.FolderItem}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Folders</em>' containment reference list isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Folders</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_Folders()
     * @model type="org.talend.core.model.properties.FolderItem" containment="true"
     * @generated
     */
    EList getFolders();

    /**
     * Returns the value of the '<em><b>Deleted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deleted</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deleted</em>' attribute.
     * @see #setDeleted(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_Deleted()
     * @model unique="false" required="true"
     * @generated
     */
    boolean isDeleted();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#isDeleted <em>Deleted</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Deleted</em>' attribute.
     * @see #isDeleted()
     * @generated
     */
    void setDeleted(boolean value);

    /**
     * Returns the value of the '<em><b>Delete Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delete Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delete Date</em>' attribute.
     * @see #setDeleteDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_DeleteDate()
     * @model unique="false"
     * @generated
     */
    Date getDeleteDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getDeleteDate <em>Delete Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete Date</em>' attribute.
     * @see #getDeleteDate()
     * @generated
     */
    void setDeleteDate(Date value);

    /**
     * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Creation Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Creation Date</em>' attribute.
     * @see #setCreationDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getProject_CreationDate()
     * @model unique="false" required="true"
     * @generated
     */
    Date getCreationDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Project#getCreationDate <em>Creation Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Creation Date</em>' attribute.
     * @see #getCreationDate()
     * @generated
     */
    void setCreationDate(Date value);

} // Project
