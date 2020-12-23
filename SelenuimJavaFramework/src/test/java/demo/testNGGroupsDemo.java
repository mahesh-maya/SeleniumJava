package demo;

import org.testng.annotations.Test;

public class testNGGroupsDemo {

	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		System.out.println(" this is test 2");
	}
	
	@Test(groups = {"regression","smoke"})
	public void test3() {
		System.out.println("this is test 3");
	}
	
	@Test(groups = {"regression"})
	public void test5() {
		System.out.println("this is test 5");
	}
	
	@Test(groups = {"windows.regression"})
	public void test4() {
		System.out.println("this is test 4");
	}
	
	
}
