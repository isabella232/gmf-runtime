/*
 * Copyright (c) 2015 Christian W. Damus and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Christian W. Damus - initial API and implementation 
 */

package org.eclipse.gmf.runtime.emf.type.core;

/**
 * A convenience for implementers of context manager listeners to selectively
 * implement a subset of the call-back protocol. All method implementations are
 * empty.
 * 
 * @since 1.9
 */
public class ClientContextManagerAdapter implements IClientContextManagerListener {

	public ClientContextManagerAdapter() {
		super();
	}

	public void clientContextAdded(ClientContextAddedEvent event) {
		// Pass
	}

	public void clientContextRemoved(ClientContextRemovedEvent event) {
		// Pass
	}

}
