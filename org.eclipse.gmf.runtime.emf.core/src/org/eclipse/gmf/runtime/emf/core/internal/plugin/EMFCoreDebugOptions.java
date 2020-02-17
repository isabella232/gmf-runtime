/******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.emf.core.internal.plugin;



/**
 * A list of debug options for this plug-in.
 * 
 * @author rafikj
 */
public final class EMFCoreDebugOptions {

	private EMFCoreDebugOptions() {
		// private
	}

	public static final String DEBUG = EMFCorePlugin.getPluginId() + "/debug"; //$NON-NLS-1$

	public static final String EXCEPTIONS_CATCHING = DEBUG
		+ "/exceptions/catching"; //$NON-NLS-1$

	public static final String EXCEPTIONS_THROWING = DEBUG
		+ "/exceptions/throwing"; //$NON-NLS-1$

	public static final String METHODS_ENTERING = DEBUG + "/methods/entering"; //$NON-NLS-1$

	public static final String METHODS_EXITING = DEBUG + "/methods/exiting"; //$NON-NLS-1$
	
	public static final String MODEL_OPERATIONS = DEBUG + "/model/operations"; //$NON-NLS-1$

	public static final String EVENTS = DEBUG + "/events/tracing"; //$NON-NLS-1$	
	
	public static final String RESOURCES = DEBUG + "/resources"; //$NON-NLS-1$
}