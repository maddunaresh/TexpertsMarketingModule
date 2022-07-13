package com.marketingmodule.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.marketingmodule.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	
	
	
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		logger.info("URL opened.....");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is enterd");
		lp.setPassword(password);
		logger.info("password is entered");
		
		lp.clickLogin();
		logger.info("Login Button is clicked");
		
		Thread.sleep(20000);
		
		if(driver.getTitle().equals("Texperts HRM"))
		{
			Assert.assertTrue(true);
			logger.info("Test Passed");
		}
		
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
	}
	
	
	

}
