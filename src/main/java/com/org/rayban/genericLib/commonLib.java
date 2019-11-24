package com.org.rayban.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonLib extends Driver {

	public void hardWait() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.getMessage();
		}
	    }
	
	public void implicitwait(int timeunitSec) {
	driver.manage().timeouts().implicitlyWait(timeunitSec, TimeUnit.SECONDS);
	}
	
	
	public void explicitWait(int timeunitSec,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,timeunitSec);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
		}
	
    public void actionOperation() {
    	Actions act = new Actions(driver);
    	act.sendKeys(Keys.ENTER).perform();
    }
	
	
}
