package com.qa.factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();
	
	
	//we are initializing webdriver based on the given browser
	public WebDriver init_driver(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set((WebDriver) new ChromeDriver());
		}
		else
		{
			System.out.println("pas a valid driver name");
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	public static WebDriver getDriver()
	{
		return tlDriver.get();
	}
	
}
