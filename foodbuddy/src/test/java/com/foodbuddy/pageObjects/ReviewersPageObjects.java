package com.foodbuddy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewersPageObjects {
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Reviewers']")
    public static WebElement reviewersButton;
	
	@FindBy(id = "searchQuery")
	public static WebElement searchHere;
	
	@FindBy(xpath = "//button[@class='px-4 py-2 mr-2 btn btn-primary']")
	public static WebElement searchButton;
	
	@FindBy(xpath = "//button[@class='px-4 py-2 btn btn-outline-danger']")
	public static WebElement clearButton;
	
	@FindBy(xpath = "(//button[@class='btn btn-danger mt-1 btn-sm'])[1]")
	public static WebElement followButton;
	
	@FindBy(xpath = "(//button[@class='mt-1 btn btn-outline-danger btn-sm'])[1]")
	public static WebElement followingButton;
	
	@FindBy(xpath = "(//span[@class='py-2 badge badge-success'])[1]")
	public static WebElement reviewbutton;
	
	public ReviewersPageObjects(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}

}
