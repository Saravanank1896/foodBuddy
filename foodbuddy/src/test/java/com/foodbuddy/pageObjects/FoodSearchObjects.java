package com.foodbuddy.pageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodSearchObjects {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@class='bl-0 br-0 pl-0 form-control']")
	public WebElement searchHereButton;
	
	@FindBy(xpath = "//button[text()='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//button[text()='Clear']")
	public WebElement clearButton;
	
	public FoodSearchObjects(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	
	
}
