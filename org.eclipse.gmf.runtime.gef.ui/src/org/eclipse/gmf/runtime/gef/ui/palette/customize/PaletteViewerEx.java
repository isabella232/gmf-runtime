/******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.gef.ui.palette.customize;

import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.customize.PaletteCustomizerDialog;

/**
 * GMF's version of the <code>PaletteViewer</code> extended to:
 * <li>override the <code>PaletteCustomizerDialog</code></li>
 * 
 * @since 2.1
 * @author crevells
 */
public class PaletteViewerEx
    extends PaletteViewer {

    private PaletteCustomizerDialog customizerDialog = null;

    public PaletteViewerEx() {
        super();
    }

    public PaletteCustomizerDialog getCustomizerDialog() {
        if (customizerDialog == null) {
            customizerDialog = new PaletteCustomizerDialogEx(getControl()
                .getShell(), getCustomizer(), getPaletteRoot());
        }
        return customizerDialog;
    }

}
