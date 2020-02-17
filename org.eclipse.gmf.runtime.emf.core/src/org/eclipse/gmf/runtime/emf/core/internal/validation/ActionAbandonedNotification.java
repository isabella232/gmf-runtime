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


package org.eclipse.gmf.runtime.emf.core.internal.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.impl.NotificationImpl;


/**
 * A fake notification that is inserted into the notifications to be validated,
 * to cause abandonment of the write action.  The
 * {@link DestroyableObjectsConstraint} detects the presence of this
 * notification and causes live validation to fail.
 *
 * @author Christian W. Damus (cdamus)
 * 
 * @see DestroyableObjectsConstraint
 */
public class ActionAbandonedNotification
	extends NotificationImpl {

	private IStatus status;
	
	/**
	 * Initializes me with my status.
	 * 
	 * @param status my status
	 */
	public ActionAbandonedNotification(IStatus status) {
		super(-1, null, null);
		
		this.status = status;
	}

	/**
	 * Gets the status describing the abandonment of the action.
	 * 
	 * @return the action abandonment status
	 */
	public IStatus getStatus() {
		return status;
	}
}
