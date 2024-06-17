package com.foodbuddy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelReviewPageObjects {
	public static WebDriver driver;
	
	@FindBy(xpath = "//h1[text()='Following']")
	public WebElement followingButton;
	
	@FindBy(xpath = "//i[@class='icofont-thumbs-up']")
	public WebElement thumbUpButton;
	
	@FindBy(xpath = "(//input[@class='bl-0 br-0 pl-0 form-control'])[1]")
	public WebElement searchHereButton;
	
	@FindBy(xpath = "(//button[text()='Search'])[1]")
	public WebElement searchButton;
	
	@FindBy(xpath = "(//button[text()='Clear'])[1]")
	public WebElement clearButton;
	
	@FindBy(xpath = "//b[text()='Geetham Veg Restaurant']")
	public WebElement geethamClick;
	
	public HotelReviewPageObjects(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	

}
