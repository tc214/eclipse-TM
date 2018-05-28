/*******************************************************************************
 * Copyright (c) 2014, 2016 Wind River Systems, Inc. and others. All rights reserved.
 * This program and the accompanying materials are made available under the terms
 * of the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Wind River Systems - initial API and implementation
 * Dirk Fauth - [460496] Moved from o.e.tm.t.connector.local.showin.interfaces
 *******************************************************************************/
package org.eclipse.tm.terminal.view.ui.interfaces;

/**
 * External executables data property names.
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 * @since 4.1
 */
public interface IExternalExecutablesProperties {

	/**
	 * The name/label of the external executable.
	 */
	public final String PROP_NAME = "Name"; //$NON-NLS-1$

	/**
	 * The absolute path of the external executable.
	 */
	public final String PROP_PATH = "Path"; //$NON-NLS-1$

	/**
	 * The arguments to pass to the external executable.
	 */
	public final String PROP_ARGS = "Args"; //$NON-NLS-1$

	/**
	 * The absolute path to the icon representing the external executable.
	 */
	public final String PROP_ICON = "Icon"; //$NON-NLS-1$

	/**
	 * If set, backslashes are translated to forward slashes on paste.
	 */
	public final String PROP_TRANSLATE = "Translate"; //$NON-NLS-1$
}
