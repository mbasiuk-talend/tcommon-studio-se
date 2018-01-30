// ============================================================================
//
// Copyright (C) 2006-2017 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.model.process;

import org.eclipse.swt.events.FocusListener;

/**
 * extended EP for advanced features and UI interactions.
 * 
 */
public interface IAdvancedElementParameter extends IElementParameter {
    // placeholder
    String getMessage();
    void setMessage(String message);
    FocusListener getFocusListener(); 
}
