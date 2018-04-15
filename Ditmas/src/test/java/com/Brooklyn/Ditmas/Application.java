package com.Brooklyn.Ditmas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Application {
	
	@Test
	public void mytest102()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Ekramul/Documents/Selenium file folder/SeleniumWebdriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
	}
 
	@Test
	public void mytest1020()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Ekramul/Documents/Selenium file folder/SeleniumWebdriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.yahoo.com/");
	
	}
	
	@Test
	public void mytest1000()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Ekramul/Documents/Selenium file folder/SeleniumWebdriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com/");
	
	}
}
