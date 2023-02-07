package AppHooks;


import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApploicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	@Before(order = 0)
	public void getProperty() {
configReader=new ConfigReader();
prop=configReader.init_prop();
	}
	@Before(order =1)
	public void launchBrowser()
	{
		String browsername=prop.getProperty("browser");
		driverFactory=new DriverFactory();
		driver=driverFactory.init_driver(browsername);
		
	}
	@After(order = 0)
	public void quit()
	{
		driver.quit();
	}
	
	@After(order = 1)
	public  void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			//takeScreenshot
			String screenShotName=scenario.getName().replaceAll(" ", "_");
			byte [] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
		else
		{
			String screenShotName=scenario.getName().replaceAll(" ", "_");
			byte [] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		
		}
	}}
	
