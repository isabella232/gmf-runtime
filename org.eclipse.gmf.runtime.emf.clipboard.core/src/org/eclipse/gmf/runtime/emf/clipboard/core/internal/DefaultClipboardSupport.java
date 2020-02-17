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


package org.eclipse.gmf.runtime.emf.clipboard.core.internal;

import org.eclipse.gmf.runtime.emf.clipboard.core.AbstractClipboardSupport;
import org.eclipse.gmf.runtime.emf.clipboard.core.IClipboardSupport;

/**
 * Default implementation of the {@link IClipboardSupport} API,
 * used in situations where no support has been provided for a metamodel.
 *
 * @author Christian W. Damus (cdamus)
 */
public class DefaultClipboardSupport
	extends AbstractClipboardSupport {

	private static final IClipboardSupport instance = new DefaultClipboardSupport();
	
	private DefaultClipboardSupport() {
		super();
	}

	/**
	 * Obtains the singleton instance of this class.
	 * 
	 * @return my instance
	 */
	public static IClipboardSupport getInstance() {
		return instance;
	}
}
