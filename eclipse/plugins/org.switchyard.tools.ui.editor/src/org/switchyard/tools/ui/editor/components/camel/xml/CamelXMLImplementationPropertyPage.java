/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.xml;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.AbstractPropertyPage;

/**
 * CamelJavaRouteComposite
 * 
 * <p/>
 * Property page implementation for Camel Route implementations.
 */
public class CamelXMLImplementationPropertyPage extends AbstractPropertyPage<Component> {

    @Override
    protected AbstractModelComposite<Component> createComposite(Composite parent, int style) {
        return new CamelXMLRouteComposite(this, parent, style);
    }

}
