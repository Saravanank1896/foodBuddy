package com.foodbuddy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Login']")
	public  WebElement login;
	
	@FindBy(name = "Country Code")
	public  WebElement phoneNumber;
	
	@FindBy(xpath ="//a[text()='Login']")
	public  WebElement loginButton;
	
	public LoginPageObjects(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
}
