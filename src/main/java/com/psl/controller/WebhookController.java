/**
 * 
 */
package com.psl.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.psl.model.ClientIDTest;

/**
 * @author niranjana_naik
 *
 */
@RestController
public class WebhookController {
	@Autowired
	private ClientIDTest xAdobeSignClientId;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ClientIDTest getMethod(HttpServletRequest request) {
		// request.getHeader("X-AdobeSign-ClientId")
		xAdobeSignClientId.setxAdobeSignClientId("sdfdn45");
		return xAdobeSignClientId;
	}

	@RequestMapping(value = "webhook", method = RequestMethod.GET)
	public ClientIDTest getWebhookGET(@RequestHeader("X-AdobeSign-ClientId") String xAdobeSignClientId) {
		// ClientId getWebhookGET() {
		ClientIDTest clientId = new ClientIDTest();
		// clientId.setxAdobeSignClientId("CBJCHBCAABAAVAMhAcHcH-oyVVAzsdm8qelsEg2N__ZA");
		clientId.setxAdobeSignClientId(xAdobeSignClientId);
		System.out.println("GET Mehtod:" + clientId.getxAdobeSignClientId());
		return clientId;
	}

	@RequestMapping(value = "webhook", method = RequestMethod.POST)
	public ClientIDTest getWebhookPostEvent(@RequestHeader("X-AdobeSign-ClientId") String xAdobeSignClientId,
			@RequestBody Object object) throws IOException {
		System.out.println("POST method " + xAdobeSignClientId);
		System.out.println("output:" + object);
		return (ClientIDTest) object;
	}

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String test() {
		return "Hello World!";
	}
}
