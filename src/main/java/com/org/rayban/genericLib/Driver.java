package com.org.rayban.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public static WebDriver driver;
	
	public static void browserType() {
    System.setProperty("webdriver.gecko.driver", "F:\\Newworkspace\\mavenHybridFramework\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	}
	
	

}
