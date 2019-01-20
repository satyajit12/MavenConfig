package com.org.rayban;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.rayban.buisnessLib.loginBuissnessScenario;
import com.org.rayban.genericLib.Driver;
import com.org.rayban.genericLib.MyListners;

public class DemoTest extends MyListners{

	loginBuissnessScenario lb = new loginBuissnessScenario();
	
	@BeforeTest
	
	public void lunchingBrowser() throws MalformedURLException, InterruptedException {
	Driver.browserType();
		
	}
	
	@BeforeMethod
	public void lunchingSignInPage() {
	Driver.driver.get("https://github.com/");
	System.out.println("Application Is Lunched");
	}
	
	
	//@Test
	public void navigateToLoginPage() throws InterruptedException, MalformedURLException {
	lb.clickOnSignInButton();
	}
	
	
	@Test
	
	public void successfullLogin() throws MalformedURLException, InterruptedException{
	lb.clickOnSignInButton();	
	lb.	loginToGitApp(); 
	lb.	validateLoginSuccessful();
    Driver.driver.quit();
	}
	
	
	//@Test
	
	public void logout() {
		logout();
	}
	   
}
