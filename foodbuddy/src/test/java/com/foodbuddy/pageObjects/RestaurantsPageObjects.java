package com.foodbuddy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantsPageObjects {
	public static WebDriver driver;

	public RestaurantsPageObjects(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Restaurants']")
	public  WebElement restaurant;

	@FindBy(xpath = "//a[text()='+ Add Restaurant']")
	public  WebElement addrestaurant;

	@FindBy(xpath = "//input[@placeholder='name']")
	public  WebElement name;

	@FindBy(xpath = "//input[@placeholder='lattitude']")
	public  WebElement lattitude;

	@FindBy(xpath = "//input[@placeholder='longitude']")
	public  WebElement longitude;

	@FindBy(xpath = "//textarea[@placeholder='address']")
	public  WebElement address;

	@FindBy(xpath = "//button[text()='Close']")
	public  WebElement closeButton;

	@FindBy(xpath = "//button[text()='Confirm Add']")
	public  WebElement confirmAddButton;

	@FindBy(xpath = "(//button[@class='btn btn-outline-secondary'])[1]")
	public  WebElement ratingStar1;

	@FindBy(xpath = "(//button[@class='btn btn-outline-secondary'])[2]")
	public  WebElement ratingStar2;

	@FindBy(xpath = "(//button[@class='btn btn-outline-secondary'])[3]")
	public  WebElement ratingStar3;

	@FindBy(xpath = "(//button[@class='btn btn-outline-secondary'])[4]")
	public  WebElement ratingStar4;

	@FindBy(xpath = "(//button[@class='btn btn-outline-secondary'])[5]")
	public  WebElement ratingStar5;

	@FindBy(xpath = "//input[@class='bl-0 form-control']")
	public  WebElement locationSearch;

	@FindBy(xpath = "//input[@class='shadow-sm form-control']")
	public  WebElement restaurantSearch;

	@FindBy(xpath = "//button[@class='mx-2 mt-1  btn btn-outline-danger']")
	public  WebElement restaurantSearchclearButton;

	@FindBy(xpath = "//button[@class='mt-1  btn btn-primary']")
	public  WebElement restaurantSearchButton;

	@FindBy(xpath = "//button[@class='text-left d-flex align-items-center  p-0 btn btn-link btn-block']")
	public  WebElement distanceButton;
	
	@FindBy(xpath = "//input[@id='volume']")
	public  WebElement distanceRangeButton;
	
	@FindBy(xpath = "(//button[@class='text-left  d-flex align-items-center p-0 btn btn-link btn-block'])[1]")
	public  WebElement sortByButton;
	
	@FindBy(xpath = "(//input[@class='custom-control-input'][1]")
	public  WebElement sortByAtoZButton;
	
	@FindBy(xpath="(//input[@class='custom-control-input'][2]")
	public  WebElement sortByZtoAButton;
	
	@FindBy(xpath = "//button[@class='text-left d-flex  align-items-center p-0 btn btn-link btn-block']")
	public  WebElement foodTypeButton;
	
	@FindBy(xpath  = "(//input[@id='custom-cb15']")
	public  WebElement foodTypeJuiceButton;
	
	@FindBy(xpath = "(//input[@class='custom-control-input'])[4]")
	public  WebElement foodTypeNonVegButton;
	
	@FindBy(xpath = "(//input[@class='custom-control-input'])[5]")
	public  WebElement foodTypeVegButton;
	
	@FindBy(xpath = "(//input[@class='custom-control-input'])[6]")
	public  WebElement foodTypeDessertButton;
	
	@FindBy(xpath = "//button[text()='Followers']")
	public  WebElement followersButton;
	
	@FindBy(xpath = "(//input[@class='custom-control-input'])[7]")
	public  WebElement selectAllFollowersButton;
	
	@FindBy(xpath = "//button[@class='mr-2 btn btn-outline-danger']")
	public  WebElement clearButton;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public  WebElement submitButton;
	
	@FindBy(xpath = "//a[text()='Work With Us']")
	public  WebElement workWithUsButton;
	
	@FindBy(xpath = "//a[text()='Register now']")
	public  WebElement registerNowButton;
	
	@FindBy(xpath = "//a[text()='contest.']")
	public  WebElement contestButton;
	
	@FindBy(linkText = "Home")
	public  WebElement homeButton;
	
	@FindBy(linkText = "About Us")
	public  WebElement aboutUsButton;
	
	@FindBy(linkText = "Contact Us")
	public  WebElement contactUsButton;
	
	@FindBy(linkText = "Terms & Condition")
	public  WebElement termsAndConditionButton;
	
	@FindBy(linkText = "FAQ")
	public  WebElement faqButton;
	
	@FindBy(linkText = "Privacy Policy")
	public  WebElement privacyPolicyButton;
	
	@FindBy(linkText = "WhatsApp")
	public  WebElement whatsAppButton;
	
	@FindBy(linkText = " Email")
	public  WebElement emailButton;
	
	@FindBy(linkText = " Phone Number")
	public  WebElement phoneNumberButton;
	
	@FindBy(linkText = " Twitter")
	public  WebElement twitterButton;
	
	@FindBy(linkText = " YouTube")
	public  WebElement youTubeButton;
	
	
}
