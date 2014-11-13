package com.ajeesh.ws.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ajeesh.ws.HelloService;

public class WSClient {
	
	public static void main (String[] args ) throws Exception{
		
		URL url = new URL("http://localhost:9090/hello?wsdl"); 
		
		QName qName = new QName("http://ws.ajeesh.com/", "HelloServiceImplService");
		
		Service service = Service.create(url, qName);
		
		HelloService helloService = service.getPort(HelloService.class);
		
		System.out.println(helloService.getGreetingAsString("Aj")); 
	}

}
