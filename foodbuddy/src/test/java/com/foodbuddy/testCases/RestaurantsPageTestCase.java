package com.foodbuddy.testCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.foodbuddy.pageObjects.LoginPageObjects;
import com.foodbuddy.pageObjects.RestaurantsPageObjects;
import com.foodbuddy.utilities.BaseClass;

public class RestaurantsPageTestCase extends BaseClass {
	public LoginPageObjects loginPageObjects;
	public RestaurantsPageObjects restaurantsPageObjects;
	public WebDriverWait wait;

	@Test(enabled = false)
	public void restaurants() {
		loginPageObjects = new LoginPageObjects(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginPageObjects.login)).click();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginPageObjects.phoneNumber)).sendKeys(phnum);

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(loginPageObjects.loginButton)).click();
	}

	@Test(priority = 2, dependsOnMethods = "com.foodbuddy.testCases.LoginPageTestCase.loginTestCase")
	public void restaurantsClick() {
		RestaurantsPageObjects restaurantsPageObjects = new RestaurantsPageObjects(driver);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(restaurantsPageObjects.restaurant)).click();

		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(restaurantsPageObjects.ratingStar3)).click();

		Actions actions = new Actions(driver);
		actions.moveToElement(restaurantsPageObjects.ratingStar3).build().perform();
	}

	@Test(priority = 3, dependsOnMethods = "restaurantsClick")
	public void locationSearch() {
		restaurantsPageObjects = new RestaurantsPageObjects(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(restaurantsPageObjects.locationSearch)).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(restaurantsPageObjects.locationSearch))
				.sendKeys("coimbatore");

		restaurantsPageObjects.distanceButton.click();

	}

	@Test(priority = 4, dependsOnMethods = "locationSearch")
	public void foodTypeButton() {
		restaurantsPageObjects = new RestaurantsPageObjects(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(restaurantsPageObjects.foodTypeButton)).click();

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(restaurantsPageObjects.submitButton)).click();

	}

}
