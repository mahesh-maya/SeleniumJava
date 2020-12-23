package demo;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testNGParametersDemo {


	@Test
	@Parameters({"MyName"})
	public void test(String name) {

		System.out.println("my name is : "+name);
	}

}
