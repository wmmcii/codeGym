package com.ajeesh.ws.test;

public class MainTester {
	
	
	public static String getMessagge()
	{
		return "This is a msg";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		
		/*System.out.println("Test 2");
		System.out.println(new MainTester().getMessagge());
		System.out.println(getMessagge());*/
		
		AutoMobile auto = new AutoMobile();
		System.out.println(auto.run());
		Car car = new Car();
		System.out.println(car.run());
		
		System.out.println("car wheel" + car.noOfWheels);
		System.out.println("auto wheel" + auto.noOfWheels);
		
		main("test");
		
	}
	
	public static void main(String arg){
		System.out.println("main2 " + arg);
	}

}
