package demo;

import org.testng.annotations.Test;

public class testNGRetryFailedTestCases {

	@Test
	public void test1() {
		System.out.println("Inside test 1");
	}
	
	@Test(retryAnalyzer = listener.retryAnalyzer.class)
	public void test2() {
		System.out.println("Inside test 2");
		int a = 1/0;
	}
	
	@Test
	public void test3() {
		System.out.println("Inside test 3");
	}
}
