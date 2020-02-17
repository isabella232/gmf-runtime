/******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.examples.runtime.diagram.logic.internal.preferences;

import org.eclipse.gmf.examples.runtime.diagram.logic.internal.LogicDiagramPlugin;
import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

/**
 * The connections preference page used for the Logic Diagram preferences.
 * 
 * @author cmahoney
 */
public class LogicConnectionsPreferencePage
	extends ConnectionsPreferencePage {

	/**
	 * Creates a new instance.
	 */
	public LogicConnectionsPreferencePage() {
		super();
		setPreferenceStore(LogicDiagramPlugin.getInstance()
			.getPreferenceStore());
	}

}
