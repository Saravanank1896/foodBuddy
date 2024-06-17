package com.foodbuddy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPageObjects  {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle nav-link']")
	public WebElement logoutclick;
	
	@FindBy(xpath = "//a[text()=' Logout']")
	public WebElement logoutbutton;
	
	public LogOutPageObjects(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
}
