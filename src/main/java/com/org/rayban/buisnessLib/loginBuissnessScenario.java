package com.org.rayban.buisnessLib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.org.rayban.genericLib.Driver;
import com.org.rayban.pageObjectModel.loginPage;

public class loginBuissnessScenario {

	loginPage login = PageFactory.initElements(Driver.driver, loginPage.class);
	
	
	public void clickOnSignInButton() throws InterruptedException {
		Driver.browserType();
		Driver.driver.get("https://github.com/");
		//WebElement elb = login.getSignInButton();
		WebDriverWait wait = new WebDriverWait(Driver.driver, 180);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Sign in']")));
		//Thread.sleep(10000);
				
		Driver.driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//login.getSignInButton().click();
	
	    }
	
	public void loginToGitApp() {
		Driver.driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("satyajit12");
		Driver.driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mami@789");
		Driver.driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		}
	
	
	public void validateLoginSuccessful() {
		String expectedResult = "Learn Git and GitHub without any code!";
		String actualResult = Driver.driver.findElement(By.xpath("//h2[text()='Learn Git and GitHub without any code!']")).getText();
		Assert.assertEquals(actualResult, expectedResult, "validation failed");
	}
	
	
	public void logout() {
		WebDriverWait wait = new WebDriverWait(Driver.driver, 240);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='user-links']/li[3]")));
		Driver.driver.findElement(By.xpath("//ul[@id='user-links']/li[3]")).click();
		Driver.driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
		
	}
	
	
	
}
