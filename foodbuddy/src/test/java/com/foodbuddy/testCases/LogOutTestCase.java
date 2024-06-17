package com.foodbuddy.testCases;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.foodbuddy.pageObjects.LogOutPageObjects;
import com.foodbuddy.utilities.BaseClass;

public class LogOutTestCase extends BaseClass {
	public LogOutPageObjects logOutPageObjects;
	public WebDriverWait wait;

	@Test
	public void logout() {
		logOutPageObjects = new LogOutPageObjects(driver);

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		try {
			wait.until(ExpectedConditions.elementToBeClickable(logOutPageObjects.logoutclick)).click();
			wait.until(ExpectedConditions.elementToBeClickable(logOutPageObjects.logoutbutton)).click();

			System.out.println("Performed logout actions successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}