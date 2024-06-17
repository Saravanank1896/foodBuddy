package com.foodbuddy.testCases;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.foodbuddy.pageObjects.FoodSearchObjects;
import com.foodbuddy.pageObjects.HotelReviewPageObjects;
import com.foodbuddy.pageObjects.LoginPageObjects;
import com.foodbuddy.pageObjects.RestaurantsPageObjects;
import com.foodbuddy.pageObjects.ReviewersPageObjects;
import com.foodbuddy.utilities.BaseClass;

public class ReviewersPageTestCase extends BaseClass {
	public LoginPageObjects loginPageObjects;
	public RestaurantsPageObjects restaurantsPageObjects;
	public ReviewersPageObjects reviewersPageObjects;
	public HotelReviewPageObjects hotelReviewPageObjects;
	public FoodSearchObjects foodSearchObjects;
	public WebDriverWait wait;

	@Test(priority = 1)
	public void reviewersSearchButton() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		reviewersPageObjects = new ReviewersPageObjects(driver);

		wait.until(ExpectedConditions.elementToBeClickable(reviewersPageObjects.reviewersButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(reviewersPageObjects.searchHere)).sendKeys("chola");

		wait.until(ExpectedConditions.elementToBeClickable(reviewersPageObjects.searchButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(reviewersPageObjects.clearButton)).click();
	}

	@Test(priority = 3)
	public void toggleFollowState() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		if (isFollow()) {
			wait.until(ExpectedConditions.elementToBeClickable(reviewersPageObjects.followButton)).click();
		} else {
			wait.until(ExpectedConditions.elementToBeClickable(reviewersPageObjects.followingButton)).click();
		}
	}

	private boolean isFollow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		return wait.until(ExpectedConditions.visibilityOf(reviewersPageObjects.followButton)).isDisplayed();
	}

	@Test(priority = 3)
	public void reviewbuttonclick() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reviewersPageObjects.reviewbutton.click();
		
	}

	@Test(priority = 4)
	public void hotelReviewPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		hotelReviewPageObjects = new HotelReviewPageObjects(driver);

		wait.until(ExpectedConditions.elementToBeClickable(hotelReviewPageObjects.searchHereButton)).click();

		hotelReviewPageObjects.searchHereButton.sendKeys("geetham");

		wait.until(ExpectedConditions.elementToBeClickable(hotelReviewPageObjects.searchButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(hotelReviewPageObjects.geethamClick)).click();
	}

	@Test(priority = 5)
	public void foodsearch() {
		foodSearchObjects = new FoodSearchObjects(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(foodSearchObjects.searchButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(foodSearchObjects.searchHereButton)).sendKeys("icecream");

		wait.until(ExpectedConditions.elementToBeClickable(foodSearchObjects.searchButton)).click();

	}

}
