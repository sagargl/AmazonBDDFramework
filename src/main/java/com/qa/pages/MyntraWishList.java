package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class MyntraWishList extends TestBase {

	
	@FindBy(xpath="//div[2]/nav/div/div[1]/div/a")
	public WebElement MenHover; 
	
	@FindBy(xpath="//a[text()='Sweaters']")
	public WebElement sweaters;
	
	
	//Initilize the Page Objects
	public MyntraWishList()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	public boolean MenHover()
	{
		return MenHover.isDisplayed();
		
	}
	
	public void SweatersClick() throws InterruptedException
	{
		//MenHover.click();
		Actions act=new Actions(driver);
		act.moveToElement(MenHover);
		sweaters.click();
	}
	
	
	
	
	
}



