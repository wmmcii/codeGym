package com.ajeesh.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.ajeesh.ws.HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String getGreetingAsString(String name) { 		
		return "Hello " + name + " this is RPC WS"; 
	}

}
