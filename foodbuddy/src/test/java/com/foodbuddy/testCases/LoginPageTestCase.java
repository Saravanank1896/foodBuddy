package com.foodbuddy.testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.foodbuddy.pageObjects.LoginPageObjects;
import com.foodbuddy.utilities.BaseClass;

public class LoginPageTestCase extends BaseClass{
  @Test
  public void loginTestCase() {
	  
	  driver.get(baseUrl);
	  LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
	  WebDriverWait login = new WebDriverWait(driver, Duration.ofSeconds(10));
	  login.until(ExpectedConditions.elementToBeClickable(loginPageObjects.login)).click();
	  
	  WebDriverWait phnumb = new WebDriverWait(driver, Duration.ofSeconds(10));
	  phnumb.until(ExpectedConditions.elementToBeClickable(loginPageObjects.phoneNumber)).sendKeys(phnum);
	  
	  WebDriverWait loginbutton = new WebDriverWait(driver, Duration.ofSeconds(10));
	  
	  loginbutton.until(ExpectedConditions.elementToBeClickable(loginPageObjects.loginButton)).click();
	  

  }
  

}
