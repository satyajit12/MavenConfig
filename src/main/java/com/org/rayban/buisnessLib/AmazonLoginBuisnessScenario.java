package com.org.rayban.buisnessLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.PageFactory;

import com.org.rayban.genericLib.Driver;
import com.org.rayban.genericLib.commonLib;
import com.org.rayban.pageObjectModel.AmazonLoginPage;

public class AmazonLoginBuisnessScenario extends commonLib  {
	
AmazonLoginPage amazon = PageFactory.initElements(driver,AmazonLoginPage.class);
	
public void successfullLoginToAmazonWeb(String UID,String Pwd) {
		
	amazon.getUsername().sendKeys(UID);
	actionOperation();
	implicitwait(30);
	amazon.getPassword().sendKeys(Pwd);
	actionOperation();
	implicitwait(30);
	amazon.getLoginButton().click();
	implicitwait(20);
	}
	
	public void titleOFPage() {
    String title  =	driver.getTitle();
    System.out.println(title);
	}
	
	
	
	

}
