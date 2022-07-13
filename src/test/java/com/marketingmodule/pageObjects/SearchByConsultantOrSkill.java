package com.marketingmodule.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchByConsultantOrSkill {
	
	public WebDriver ldriver;
	
	public SearchByConsultantOrSkill(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	By lnkConsultants_list=By.xpath("//a[@title='Consultants']");
	By consultantSkill_search=By.xpath("//input[@placeholder='Search by consultant or skill']");
	By btnSearch=By.xpath("//*[@id=\"content\"]/div/app-sales/app-consultants/app-consultants-list/div[1]/div/div/div[1]/div[1]/div/div/p-button");
	
	
	public void consultantList()
	{
		ldriver.findElement(lnkConsultants_list).click();
	}
	
	public void searchConsultantOrSkill(String conslSkillText)
	{
		ldriver.findElement(consultantSkill_search).sendKeys(conslSkillText);
	}
	
	public void searchButton()
	{
		ldriver.findElement(btnSearch).click();
	}

}
