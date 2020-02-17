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

package org.eclipse.gmf.runtime.common.ui.services.action.internal.contributionitem;

import org.eclipse.gmf.runtime.common.core.service.IProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.ui.IActionBars;

/**
 * An operation to update the action bars of a given part type. An update may
 * occur when new providers may now provide contributions to the actionbars.
 * Only those new providers need to add their contributions.
 * 
 * @author cmahoney
 */
public final class UpdateActionBarsOperation
	extends ContributeToActionBarsOperation {

	/**
	 * Constructs a new <code>UpdateActionBarsOperation</code> instance.
	 * 
	 * @param actionBars
	 *            The part's action bars
	 * @param workbenchPartDescriptor
	 *            The part's descriptor
	 */
	public UpdateActionBarsOperation(IActionBars actionBars,
			IWorkbenchPartDescriptor workbenchPartDescriptor) {
		super(actionBars, workbenchPartDescriptor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.common.core.service.IOperation#execute(org.eclipse.gmf.runtime.common.core.service.IProvider)
	 */
	public Object execute(IProvider provider) {
		((IContributionItemProvider) provider).updateActionBars(
			getActionBars(), getWorkbenchPartDescriptor());
		return null;
	}

}
