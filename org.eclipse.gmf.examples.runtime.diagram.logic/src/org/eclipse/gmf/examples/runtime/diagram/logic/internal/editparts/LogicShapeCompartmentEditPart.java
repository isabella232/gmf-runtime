/******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.examples.runtime.diagram.logic.internal.editparts;

import org.eclipse.gmf.examples.runtime.diagram.logic.internal.editpolicies.CircuitCompartmentCanonicalEditPolicy;
import org.eclipse.gmf.examples.runtime.diagram.logic.internal.l10n.ExampleDiagramLogicMessages;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;

/**
 * @author qili
 *
 * Holds the EditPart signifying a ShapeCompartmentFigure
 */
public class LogicShapeCompartmentEditPart extends ShapeCompartmentEditPart{
	
	/**
	 * Constructor for LogicShapeCompartmentEditPart.
	 * @param view the view <code>controlled</code> by this editpart.
	 */
	public LogicShapeCompartmentEditPart(View view) {
		super(view);
	}
	
	/* 
	 * Overridden to turn off support for drag selection of children.
	 */
	protected boolean supportsDragSelection() {
		return false;
	}
	
	public String getCompartmentName() {
		return Action.removeMnemonics(ExampleDiagramLogicMessages.logic_CircuitTool_Label);
	}
	
	//install ContainerHighlightEditPolicy to highlight circuit figure
	protected void createDefaultEditPolicies(){
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new CircuitCompartmentCanonicalEditPolicy ());
	}
}
