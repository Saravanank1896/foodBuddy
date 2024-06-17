package com.foodbuddy.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();

	public static WebDriver driver;
	public String baseUrl = readConfig.getApplicationURL();
	public String phnum = readConfig.getPhNum();

	@Parameters("browser")
	@BeforeSuite
	public void setup(@Optional("chrome") String br) {

		if (br.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (br.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void closebrowser() {
	/*if (driver != null) {
        driver.quit();*/
    }

	}

