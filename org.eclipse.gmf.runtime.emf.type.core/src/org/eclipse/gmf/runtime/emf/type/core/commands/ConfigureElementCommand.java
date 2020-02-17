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

package org.eclipse.gmf.runtime.emf.type.core.commands;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;

/**
 * Edit command to configure a new model element with the characteristics of its
 * element type.
 * 
 * @author ldamus
 */
public abstract class ConfigureElementCommand
	extends EditElementCommand {

	/**
	 * The element type.
	 */
	private final IElementType elementType;

	/**
	 * Constructs a new element configuration command for the
	 * <code>request</code>.
	 * 
	 * @param request
	 *            the element configuration request
	 */
	public ConfigureElementCommand(ConfigureRequest request) {

		super(request.getLabel(), request.getElementToConfigure(), request);

		this.elementType = request.getTypeToConfigure();
	}

	/**
	 * Gets the element type.
	 * 
	 * @return the element type
	 */
	public IElementType getElementType() {
		return elementType;
	}

}