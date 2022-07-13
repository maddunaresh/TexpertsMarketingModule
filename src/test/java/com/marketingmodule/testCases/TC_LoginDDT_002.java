package com.marketingmodule.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.marketingmodule.pageObjects.LoginPage;
import com.marketingmodule.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass{

	
	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd) throws InterruptedException, IOException
	{
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		logger.info("URL opened.....");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(user);
		
		logger.info("username is enterd");
		lp.setPassword(pwd);
		logger.info("password is entered");
		
		lp.clickLogin();
		logger.info("Login Button is clicked");
		
		Thread.sleep(5000);
		
		if(driver.getTitle().equals("Texperts HRM12"))
		{
			Assert.assertTrue(true);
			logger.info("Test Passed");
		}
		
		else
		{
			//captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}
	}
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/marketingmodule/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
			}
		}
		return logindata;
		
	}
}
