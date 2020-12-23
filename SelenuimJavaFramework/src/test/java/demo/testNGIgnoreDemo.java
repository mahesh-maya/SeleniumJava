package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class testNGIgnoreDemo {

	@Test
	public void test1() {
		System.out.println("Inside test 1");
	}
	
	@Ignore
	@Test
	public void test2() {
		System.out.println("Inside test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Inside test 3");
	}
	
}
