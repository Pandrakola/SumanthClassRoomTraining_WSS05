package sample;

import org.testng.annotations.Test;

public class T1 {   //TestNG class
	
	final int a = 0;
	
	@Test(priority = 1)
	public void testCase1() {   //test case
		//test steps
		System.out.println("From testCase1");
	}
	
	@Test()
	public void run() {   //test case
		System.out.println("From run");
	}
	
	@Test(invocationCount = 6)
	public void execute() {   //test case
		System.out.println("From execute");
	}
}
