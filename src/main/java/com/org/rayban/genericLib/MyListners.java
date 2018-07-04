package com.org.rayban.genericLib;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListners implements ITestListener {
	
	protected static ExtentReports reports;
	protected static ExtentTest test;
	
	
	
	public void onFinish(ITestContext context) {
		
		  System.out.println("on finish");
 reports.endTest(test);
		  reports.flush();
	
		
	}
	public void onStart(ITestContext context) {
		 reports = new ExtentReports(new SimpleDateFormat("YYYY-MM-dd hh-mm-ss-ms").format(new Date()) + "reports.html");
		 
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test sucess within percentage");
		
	}
	
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failed");
	    test.log(LogStatus.SKIP, result.getMethod().getMethodName() + "test is failed");
	    TakesScreenshot ts =  (TakesScreenshot) Driver.driver; 
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    
	   
	    
	    try {
			FileUtils.copyFile(src, new File("F:\\Newworkspace\\mavenHybridFramework\\ScreenShorts" + result.getMethod().getMethodName() + ".png"));
			   String file = test.addScreenCapture("F:\\Newworkspace\\mavenHybridFramework\\ScreenShorts" + result.getMethod().getMethodName() + ".png");

			   test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed", file);

			   test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed", result.getThrowable().getMessage());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
	
	
	
	public void onTestSkipped(ITestResult result) {
    System.out.println("on test skipped");
    test.log(LogStatus.SKIP, result.getMethod().getMethodName() + "test is skipped");
		
	}
	
	
	   public void onTestStart(ITestResult result) {
		
		System.out.println("On test Start");
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName(), "test is started");
		}
	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
        test.log(LogStatus.PASS, result.getMethod().getMethodName() + "test is passed");
		}
	
	
	
	

}
