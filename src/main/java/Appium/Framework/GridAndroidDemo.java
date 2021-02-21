package Appium.Framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class GridAndroidDemo {
	public static final String AUTOMATE_USERNAME = "thunderstorm3";
	public static final String AUTOMATE_ACCESS_KEY = "sBLy8p6KRpJABJF8H9X8";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static WebDriver capabilities() throws Exception {
	 DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability("browserName", "Android");
	 caps.setCapability("device", "Samsung Galaxy S9 Plus");
	 caps.setCapability("realMobile", "true");
	 caps.setCapability("os_version", "9.0");
	 caps.setCapability("name", "Google Search"); // test name
	 caps.setCapability("build", "Android Web Testing"); // CI/CD job or build name
	 WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	 return driver;
	 // Setting the status of test as 'passed' or 'failed' based on the condition; if title of the web page starts with 'BrowserStack'
	 
	}

	// This method accepts the status, reason and WebDriver instance and marks the test on BrowserStack
	public static void markTestStatus(String status, String reason, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
	}
}
