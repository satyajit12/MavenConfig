package com.org.rayban.genericLib;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
	
	public static WebDriver driver;
	
	public static void browserType() throws MalformedURLException {
   /*System.setProperty("webdriver.gecko.driver", "F:\\Newworkspace\\mavenHybridFramework\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();*/
	
	System.setProperty("webdriver.chrome.driver", "F:\\Newworkspace\\mavenHybridFramework\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	/*System.out.println("Remote Driver started");
	System.setProperty("webdriver.chrome.driver", "F:\\Newworkspace\\mavenHybridFramework\\Drivers\\chromedriver.exe");
	DesiredCapabilities dr = DesiredCapabilities.chrome();
	dr.setPlatform(Platform.WIN10);
	dr.setBrowserName("node-chrome");
	dr.setVersion("");
	driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),dr);
	System.out.println("Remote Driver finished");*/
	
	
	}
	
	

}
