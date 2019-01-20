package com.org.rayban.buisnessLib;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.org.rayban.genericLib.Driver;
import com.org.rayban.pageObjectModel.loginPage;

public class loginBuissnessScenario {

	loginPage login = PageFactory.initElements(Driver.driver, loginPage.class);
	
	
	public void clickOnSignInButton() throws InterruptedException, MalformedURLException {
		
		//WebElement elb = login.getSignInButton();
		WebDriverWait wait = new WebDriverWait(Driver.driver, 180);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[div[@class='d-lg-flex mr-lg-3 mb-3 mb-lg-0']]/a[1]")));
		//Thread.sleep(10000);
		Driver.driver.findElement(By.xpath("//div[div[@class='d-lg-flex mr-lg-3 mb-3 mb-lg-0']]/a[1]")).click();		
		//Driver.driver.findElement(By.xpath("//a[text()='Sign-in']")).click();
		//login.getSignInButton().click();
	
	    }
	
	public void loginToGitApp() {
		WebDriverWait wait = new WebDriverWait(Driver.driver, 180);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='login_field']")));
		Driver.driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("satyajit12");
		Driver.driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mami@789");
		Driver.driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		}
	
	
	public void validateLoginSuccessful() {
		WebDriverWait wait = new WebDriverWait(Driver.driver, 180);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Learn Git and GitHub without any code!']")));
		
		String expectedResult = "Learn Git and GitHub without any code!";
		String actualResult = Driver.driver.findElement(By.xpath("//h2[text()='Learn Git and GitHub without any code!']")).getText();
		Assert.assertEquals(actualResult, expectedResult, "validation failed");
	}
	
	
	public void logout() {
		WebDriverWait wait = new WebDriverWait(Driver.driver, 240);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='dropdown-caret']")));
		Driver.driver.findElement(By.xpath("//span[@class='dropdown-caret']")).click();
		Driver.driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
		
	}
	
	
	
}
