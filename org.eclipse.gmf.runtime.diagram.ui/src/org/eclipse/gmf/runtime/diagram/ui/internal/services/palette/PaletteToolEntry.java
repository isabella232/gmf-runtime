/******************************************************************************
 * Copyright (c) 2002, 2003 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.diagram.ui.internal.services.palette;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteFactory;

/**
 * A tool palette entry with identity
 * 
 * @author melaasar
 */
public class PaletteToolEntry
	extends CombinedTemplateCreationEntry {
	
	/** the drawer's id */
	private Tool tool;
	private PaletteFactory factory;
	
	/**
	 * @param id
	 * @param label
	 * @param factory
	 */
	public PaletteToolEntry(
		String id,
		String label,
		PaletteFactory factory) {
		super(label, null, null, null, null, null);
		setId(id);
		this.factory = factory;
		setTemplate(this);
	}

	public Tool createTool() {
		return tool != null ? tool : factory.createTool(getId());
	}

}
