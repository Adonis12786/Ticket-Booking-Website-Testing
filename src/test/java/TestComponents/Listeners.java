package TestComponents;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.ExtentReportNG;

public class Listeners extends Base implements ITestListener {
	ExtentReports extent = ExtentReportNG.getReportObject();
	ExtentTest test;
	ThreadLocal<ExtentTest> extentReport = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		 test = extent.createTest(result.getMethod().getMethodName()); //generating unique test id for each test
		 extentReport.set(test); //this step store unique test id for each test
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		extentReport.get().log(Status.PASS, "Test Passed"); // By get method we can get that test id and test name mapped along with it.
	}

	public void onTestFailure(ITestResult result) {
	
		extentReport.get().fail(result.getThrowable());
		String destinationFile = null;
		
		/*
		 * Below step is to get driver object from specific test like this we can get
		 * value of any other variable too We cant use test method to get the driver
		 * because fields are associated with class level but not with method level
		 */
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
		
		try {
			destinationFile = getScreenShotPath(result.getMethod().getMethodName(), driver);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		extentReport.get().addScreenCaptureFromPath(destinationFile,result.getMethod().getMethodName());
		
	}
	
	
	public void onTestSkipped(ITestResult result) {
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
		
		//This step will wrap all the info and generate the report.
		extent.flush();
	}
	

	
}
