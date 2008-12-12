/******************************************************************************
 * Copyright (c) 2003, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/


package org.eclipse.gmf.runtime.diagram.ui.geoshapes.internal.draw2d.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.gmf.runtime.draw2d.ui.figures.IPolygonAnchorableFigure;

/**
 * Base class for polygons in the Geometric shapes palette
 * 
 * @author jschofie
 */
public abstract class GeoShapePolygonFigure
	extends GeoShapeFigure
	implements IPolygonAnchorableFigure {

	/**
	 * sub-class must return their list of points based on the object size
	 */
	abstract protected PointList calculatePoints(Rectangle rect);

	public GeoShapePolygonFigure(int width, int height, int spacing) {
		super(width, height, spacing);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
	 */
	protected void paintFigure(Graphics g) {
		PointList points = calculatePoints(getWidthSpecificBounds());
		g.fillPolygon(points);
		
		// set the line type and line width
		g.setLineStyle(getLineStyle());
		g.setLineWidth(getLineWidth());
		
		g.drawPolygon(points);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.geoshapes.internal.draw2d.figures.IPolygonAnchorableFigure#getPolygonPoints()
	 */
	public PointList getPolygonPoints() {
		return calculatePoints(getBounds().getCopy());
	}
	
	/**
	 * Returns bounds used for painting the figure. Normally, the bounds decreases as the line width increases
	 * in order to avoid cropping of shape outline.
	 * 
	 * @return customized bounds
	 */
	protected Rectangle getWidthSpecificBounds() {
		return getBounds().getCopy().shrink(getLineWidth() / 2, getLineWidth() / 2);
	}

}