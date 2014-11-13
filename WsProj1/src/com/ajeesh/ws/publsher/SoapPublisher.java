package com.ajeesh.ws.publsher;

import javax.xml.ws.Endpoint;

import com.ajeesh.ws.HelloServiceImpl;

public class SoapPublisher {

	public static void main(String[] args) {  
		System.out.println("Publisher starting...");
		Endpoint.publish("http://localhost:9090/hello", new HelloServiceImpl());
		System.out.println("Publisher started...");
	}

}
