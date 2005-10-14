/******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.diagram.ui.render.internal.editparts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import junit.framework.TestCase;

import org.eclipse.gmf.runtime.common.core.util.Trace;
import org.eclipse.gmf.runtime.diagram.core.internal.util.MEditingDomainGetter;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.diagram.ui.DiagramUIDebugOptions;
import org.eclipse.gmf.runtime.diagram.ui.DiagramUIPlugin;
import org.eclipse.gmf.runtime.diagram.ui.DiagramUtil;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.emf.core.edit.MRunnable;
import org.eclipse.gmf.runtime.emf.core.exceptions.MSLActionAbandonedException;
import org.eclipse.gmf.runtime.emf.core.util.OperationUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.tests.runtime.diagram.ui.util.DiagramCreator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;


/**
 * @author sshaw
 *
 * Test class for the AbstractEditPartImage class.
 */
abstract public class AbstractImageEditPartTests 
extends TestCase {
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	private Node node;

	public Node getNode() {
		return node;
	}
	
	/**
	 * Sets up the fixture, for example, open a network connection.
	 * This method is called before a test is executed.
	 */
	protected void setUp() throws Exception {
		super.setUp();

		Diagram dgrm = DiagramCreator.createEmptyDiagram(getPreferenceHint());
		node = createNode(dgrm);
	}
	
	/**
	 * @return
	 */
	protected PreferencesHint getPreferenceHint() {
		return PreferencesHint.USE_DEFAULTS;
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	protected Node createNode(final Diagram diagram) {

		final List list = new ArrayList(1);
		OperationUtil.runInUndoInterval(new Runnable() {

			public void run() {
				try {
					MEditingDomainGetter.getMEditingDomain(diagram).
						runAsWrite(new MRunnable() {

						public Object run() {
							Node note1 = DiagramUtil.createNode(diagram,
								null, ViewType.NOTE, getPreferenceHint()); //$NON-NLS-1$
							assertNotNull("Note1 creation failed", note1); //$NON-NLS-1$
							list.add(note1);
							return note1;
						}
					});
				} catch (MSLActionAbandonedException e) {
					Trace.trace(DiagramUIPlugin.getInstance(),
						DiagramUIDebugOptions.EXCEPTIONS_CATCHING,
						"MSLActionAbandonedException"); //$NON-NLS-1$
					assertFalse(false);
				}
			}
		});

		return (Node)list.get(0);
	}
	
	abstract public List getFixtures();
	
	public void test_regenerateImageFromSource() {
		List fixtures = getFixtures();
		ListIterator li = fixtures.listIterator();
		int testno = 1;
		while (li.hasNext()) {
			Object obj = li.next();
			if (obj instanceof AbstractImageEditPart) {
				AbstractImageEditPart fixture = (AbstractImageEditPart)obj;
				
				RenderedImage renderedImage = fixture.regenerateImageFromSource();
				verifyRenderedImage(renderedImage, testno++);
			}
		}
	}
	
	/**
	 * @param renderedImage
	 */
	protected void verifyRenderedImage(RenderedImage renderedImage, int testno) {
		assertTrue("renderedImage is null in testno " + (new Integer(testno)).toString(),//$NON-NLS-1$
			renderedImage != null);
		
		Image swtImage = renderedImage.getSWTImage();
		assertTrue("swtImage is null in testno " + (new Integer(testno)).toString(), //$NON-NLS-1$
			swtImage != null);
		
		// ensure the protection image isn't being returned.
		Rectangle rect = swtImage.getBounds();
		assertTrue("swtImage is not correct size in testno " + (new Integer(testno)).toString(),//$NON-NLS-1$
			rect.width > 10 && rect.height > 10);
	}

	public void test_getRenderedImage() {
		List fixtures = getFixtures();
		ListIterator li = fixtures.listIterator();
		int testno = 1;
		while (li.hasNext()) {
			Object obj = li.next();
			if (obj instanceof AbstractImageEditPart) {
				AbstractImageEditPart fixture = (AbstractImageEditPart)obj;
				
				RenderedImage renderedImage = fixture.getRenderedImage();
				verifyRenderedImage(renderedImage, testno++);
			}
		}
	}
}
