package demo;

import org.testng.annotations.Test;

public class testPriorityDemo {

	@Test(priority = -3)
	public void one() {
		
		System.out.println("Inside test 1");
	}
	
	@Test(priority = 1)
	public void two() {
		
		System.out.println("Inside test 2");
	}
	
	@Test(priority = 2)
	public void test3() {
		
		System.out.println("Inside test 3");
	}
	
}
