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

package org.eclipse.gmf.tests.runtime.common.ui.services.action.contributionitem;

import org.eclipse.jface.action.Action;

/**
 * A concrete action class to be used the test contribution item providers.
 * 
 * @author cmahoney
 */
public class MyAction
	extends Action {

	public MyAction(String id) {
		super(id);
		setId(id);
	}

}
