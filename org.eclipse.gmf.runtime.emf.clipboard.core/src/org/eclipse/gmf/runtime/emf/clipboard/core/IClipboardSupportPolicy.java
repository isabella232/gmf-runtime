/******************************************************************************
 * Copyright (c) 2009, 2010 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.emf.clipboard.core;

import org.eclipse.core.runtime.IAdaptable;

/**
 * Interface for policies for a clipboard support providers. Used to answer
 * whether or not the provider provides for an operation, without causing
 * plug-ins to be activated.
 * 
 * @author crevells
 * @since 1.3
 */
public interface IClipboardSupportPolicy {

	/**
	 * Determines if this policy provides for the given adaptable.
	 * 
	 * @param adaptable
	 *            the adaptable in question
	 * @return true if this policy provides for the given adaptable
	 */
	public boolean provides(IAdaptable adaptable);
}
