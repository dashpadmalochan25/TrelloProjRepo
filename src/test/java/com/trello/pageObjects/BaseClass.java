package com.trello.pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class BaseClass {

	public String baseURL = "https://trello.com/login";
	public String username = "dash.padmalochan25@gmail.com";
	public String password = "Dash@123";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
