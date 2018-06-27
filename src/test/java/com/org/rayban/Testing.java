package com.org.rayban;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver", "F:\\Newworkspace\\mavenHybridFramework\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
	//	driver.switchTo().alert();
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("biharisatyajit@gmail.com");

		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("bubun@789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("tv");
		java.util.List<WebElement> el = driver.findElements(By.xpath("//form[@class='_1WMLwI header-form-search']/ul"));
		
		for(int i =0;i<el.size();i++) {
		System.out.println(el.get(i).getText());
		String expectedValue = "television";
		if(el.get(i).getText()==expectedValue) {
				el.get(i).click();
		}
		}
		
	}

}
