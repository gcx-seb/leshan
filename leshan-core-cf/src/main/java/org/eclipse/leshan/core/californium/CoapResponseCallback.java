/*******************************************************************************
 * Copyright (c) 2013-2018 Sierra Wireless and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 *
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package org.eclipse.leshan.core.californium;

import org.eclipse.californium.core.coap.Response;

/**
 * On success callback for request.
 */
public interface CoapResponseCallback {
    // We should keep this as a 1 method interface to be java 8 lambda compatible.

    /**
     * Called when the request succeed.
     *
     * @param response The CoAP response received.
     */
    void onResponse(Response response);

}
