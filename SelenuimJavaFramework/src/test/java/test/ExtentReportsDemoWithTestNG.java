package test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@Test
	public void test1() throws Exception {

		// creates a toggle for the given test, adds all log events under it    
		test = extent.createTest("MyFirstTest", "Sample description");

		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

	}


	@Test
	public void test2() throws Exception {

		// creates a toggle for the given test, adds all log events under it    
				 test = extent.createTest("MyFirstTest", "Sample description");

				// log(Status, details)
				test.log(Status.INFO, "This step shows usage of log(status, details)");

				// info(details)
				test.info("This step shows usage of info(details)");

				// log with snapshot
				test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

				// test with snapshot
				test.addScreenCaptureFromPath("screenshot.png");
		
	}

	@AfterSuite
	public void tearDown() {

		extent.flush();

	}

}
