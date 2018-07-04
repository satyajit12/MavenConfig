package com.org.rayban;

import org.testng.annotations.Test;

import com.org.rayban.buisnessLib.loginBuissnessScenario;
import com.org.rayban.genericLib.Driver;
import com.org.rayban.genericLib.MyListners;

public class DemoTest extends MyListners{

	loginBuissnessScenario lb = new loginBuissnessScenario();
	
	@Test
	public void navigateToLoginPage() throws InterruptedException {
		lb.clickOnSignInButton();
	}
	
	
	@Test
	
	public void successfullLogin() {
	lb.	loginToGitApp(); 
	lb.	validateLoginSuccessful();
    Driver.driver.quit();
	}
	
	
	//@Test
	
	public void logout() {
		logout();
	}
	   
}
