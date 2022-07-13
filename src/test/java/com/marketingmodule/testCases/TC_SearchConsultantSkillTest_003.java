package com.marketingmodule.testCases;

import java.time.Duration;


import org.testng.annotations.Test;

import com.marketingmodule.pageObjects.LoginPage;
import com.marketingmodule.pageObjects.SearchByConsultantOrSkill;

public class TC_SearchConsultantSkillTest_003 extends BaseClass{
	
	@Test
	public void consultantSkillSearch() throws InterruptedException
	{
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage lp=new LoginPage(driver);
		driver.manage().window().maximize();
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		
	
		
		SearchByConsultantOrSkill scs=new SearchByConsultantOrSkill(driver);
	
		scs.consultantList();
		scs.searchConsultantOrSkill("Business Analyst");
		Thread.sleep(3000);
		scs.searchButton();
	}

}
