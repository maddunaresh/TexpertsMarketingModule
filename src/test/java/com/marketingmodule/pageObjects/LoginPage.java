package com.marketingmodule.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/app-root/app-signin/div[1]/div/div[2]/form/div/div[5]/button")
	@CacheLookup
	WebElement btnSignIn;
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pword)
	{
		txtPassword.sendKeys(pword);
	}
	
	public void clickLogin()
	{
		btnSignIn.click();
	}
	
	
	

}
