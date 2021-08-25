package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class FlipKartLoginPage extends TestBase{
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	public WebElement closetooltip; 
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	public WebElement loginbutton;
	
	@FindBy(xpath="//html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//div[2]/div/form/div[4]/button/span")
	public WebElement login;
	
	//Initilize the Page Objects
	public FlipKartLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	/*
	//Action Methods
	public boolean validateLogin()
	{
		//closetooltip.click();
		//driver.switchTo().alert();
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", closetooltip);
		//loginbutton.click();
		return loginbutton.isDisplayed();
		
	}
	*/
	public void SignInAction(String un, String pw) throws InterruptedException
	{
		//loginbutton.click();
		Thread.sleep(2000);
		username.sendKeys(un);
		password.sendKeys(pw);
	}
	
	
	
	
	
}

