package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;
	//1. By Locators
private By emailId=By.id("username");
private By password=By.id("password");
private By signInButton=By.id("kc-login");
private By falabellaImage=By.xpath("//*[@id=\"social-saml\"]/div/div[1]/img");
// 2. constructor of page class
public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
// 3. page actions
public String getLoginPageTitle()
{
	return driver.getTitle();
}
public boolean isForgotPasswordLinkExists()
{
return driver.findElement(falabellaImage).isDisplayed();	
}
public void enterUserName(String EmailId)
{
	driver.findElement(emailId).sendKeys(EmailId);
	
}
public void enterPassword(String pwd)
{
	driver.findElement(password).sendKeys(pwd);
	
}
public void clickOnSignInButton()
{
	driver.findElement(signInButton).click();
	
}
public SettlementsAuditPage loginWithUsernamePWD(String username, String pwd)
{
	driver.findElement(emailId).sendKeys(username);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(signInButton).click();
	return new SettlementsAuditPage(driver);
}
}
	