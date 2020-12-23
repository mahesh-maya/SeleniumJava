package demo;

import org.testng.annotations.Test;

public class testNGDependancies {

	@Test(dependsOnGroups = {"sanity.*"})
	public void test1() {
		System.out.println("Inside test 1 ");
	}
	
	@Test(groups = "sanity1")
	public void test2() {
		System.out.println("Inside test 2 ");
	}
	
	@Test(groups = "sanity2")
	public void test3() {
		System.out.println("Inside test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("Inside test 4");
	}
	
}
