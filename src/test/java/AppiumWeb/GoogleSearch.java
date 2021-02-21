package AppiumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Appium.Framework.GridAndroidDemo;
import Appium.PageObjects.GoogleSearchPO;

public class GoogleSearch {

	GoogleSearchPO googleSearchPageObject;
	public WebDriver driver;
	
	@BeforeTest
	public void driverini() throws Exception{
		driver = GridAndroidDemo.capabilities();
	}
	
	@Test(priority=1)
	public void initialize() {
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("facebook");
		element.submit();
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=2)
	public void testResult()
	{
		if (driver.getTitle().substring(0,12).contains("facebook")) {
			GridAndroidDemo.markTestStatus("passed","title matched!",driver);
		 }
		 else {
			 GridAndroidDemo.markTestStatus("failed","title did not match!",driver);
		 }
	}
	
	@AfterTest
	public void close(){
		driver.quit();
	}
}
