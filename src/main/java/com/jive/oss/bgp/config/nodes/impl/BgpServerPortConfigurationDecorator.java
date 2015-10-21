/**
 *  Copyright 2012 Rainer Bieniek (Rainer.Bieniek@web.de)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * 
 * File: org.bgp4.config.nodes.impl.BgpServerPortConfigurationDecorator.java 
 */
package com.jive.oss.bgp.config.nodes.impl;

import com.jive.oss.bgp.config.nodes.ServerConfiguration;
import com.jive.oss.bgp.config.nodes.ServerPortConfigurationDecorator;

/**
 * @author Rainer Bieniek (Rainer.Bieniek@web.de)
 *
 */
public class BgpServerPortConfigurationDecorator extends ServerPortConfigurationDecorator {

	private static final int BGP_PORT = 179;
	
	public BgpServerPortConfigurationDecorator(ServerConfiguration decorated) {
		super(decorated);
	}

	/* (non-Javadoc)
	 * @see org.bgp4.config.nodes.ServerPortConfigurationDecorator#getDefaultPort()
	 */
	@Override
	protected int getDefaultPort() {
		return BGP_PORT;
	}

}