/**
 * 
 */
package com.psl.model;

import org.springframework.stereotype.Component;

/**
 * @author niranjana_naik
 *
 */
@Component
public class ClientIDTest {

	private String xAdobeSignClientId;

//	public String getClientIdTest() {
//		return xAdobeSignClientId;
//	}
//
//	public void setClientIdTest(String xAdobeSignClientId) {
//		this.xAdobeSignClientId = xAdobeSignClientId;
//	}

	
	@Override
	public String toString() {
		return "ClientIDTest [xAdobeSignClientId=" + xAdobeSignClientId + "]";
	}

	public String getxAdobeSignClientId() {
		return xAdobeSignClientId;
	}

	public void setxAdobeSignClientId(String xAdobeSignClientId) {
		this.xAdobeSignClientId = xAdobeSignClientId;
	}
	
	
}
