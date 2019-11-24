package com.org.rayban;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.org.rayban.buisnessLib.AmazonLoginBuisnessScenario;
import com.org.rayban.genericLib.Driver;
import com.org.rayban.genericLib.ExcelLib;
import com.org.rayban.genericLib.MyListners;

public class amazonLoginTest extends MyListners {


    ExcelLib eLib = new ExcelLib();
    AmazonLoginBuisnessScenario alb = new AmazonLoginBuisnessScenario();
   @Test

    private void successfullLoginAmazon() throws EncryptedDocumentException, IOException {
	String username  = eLib.getData("C:\\Users\\BUBUN IS ROCKING\\Desktop\\Data.xlsx", "Sheet1", 1,0);
	String password  = eLib.getData("C:\\Users\\BUBUN IS ROCKING\\Desktop\\Data.xlsx", "Sheet1", 1,1);
    alb.successfullLoginToAmazonWeb(username, password);
    }
    
   
   
   @Test
	
   private void amazonPageTitle() {
   alb. titleOFPage();
   }


	
	
	
}
