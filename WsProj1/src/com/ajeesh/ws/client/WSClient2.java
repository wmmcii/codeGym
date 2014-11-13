package com.ajeesh.ws.client;

import com.ajeesh.ws.HelloService;
import com.ajeesh.ws.HelloServiceImplService;


public class WSClient2 {

	public static void main(String[] args) { 
		
		HelloServiceImplService service = new HelloServiceImplService();
		
		HelloService helloService = service.getHelloServiceImplPort();
		
		System.out.println(helloService.getGreetingAsString("MIckey"));
	}

}
