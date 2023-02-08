package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettlementsAuditPage {
	private WebDriver driver;
	
	// 1. create By locators for audit page
	
	By auditLink= By.xpath("//span[contains(text(),'Settlements Audit')]");
	By eventsTab=By.id("");
	By auditTab=By.xpath("//*[@id='rc-tabs-0-tab-transactions']");
	By auditDropdown=By.xpath("//*[@class='ant-select-selection-item']");
	By eventsDropdown=By.id("");
	By auditIframe=By.id("extension-iframe");
	By sideMenu=By.xpath("//*[contains(@class,'layout__sidebar__menu__item')]");
	
	//2. constructor for this class
	


	public SettlementsAuditPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//3. Action methods for the locators defined above
public void clickOnAuditMenu()
{JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,350)", "");
WebDriverWait w = new WebDriverWait(driver,100);
// presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (auditLink));
List<WebElement> listOfSideMenuElements=driver.findElements(sideMenu);
for(WebElement e: listOfSideMenuElements)
{
	System.out.println(e.getText());
}

	driver.findElement(auditLink).click();
}
public void clickOnEventsDropdown()
{
	List<WebElement> eventsList=driver.findElements(eventsDropdown);
	for(int i=0; i<eventsList.size(); i++)
	{
	String text= eventsList.get(i).getText();
if(text.equals("sellerOrderLineId"))
{
	eventsList.get(i).click();
	
}}
}
public void clickOnAuditTab()
{WebElement ele=driver.findElement(auditIframe);
driver.switchTo().frame(ele);
	driver.findElement(auditTab).click();
}
	public void clickOnAuditDropdown()
	{
		List<WebElement> auditList=driver.findElements(auditDropdown);
		for(int i=0; i<auditList.size(); i++)
		{
		String text= auditList.get(i).getText();
	if(text.equals("sellerOrderLineId"))
	{
		auditList.get(i).click();
		
	}
	}}}