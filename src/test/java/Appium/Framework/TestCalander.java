package Appium.Framework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Appium.PageObjects.MainView;
import Appium.PageObjects.ViewSubModules;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TestCalander extends Demo1 {

	public AndroidDriver<AndroidElement> driver;
	MainView view;
	ViewSubModules vs;
	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		if (!localServer().isRunning() || server == null) {
			localServer().start();
		} else{
			server = null;
		}
		driver = capanilities();
	}

	@Test(priority=1)
	public void navigateToDateWidget() throws InterruptedException {
		view = new MainView(driver);
		view.views().click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
	}

	@Test(priority=2, dependsOnMethods = { "navigateToDateWidget" })
	public void DatePicker1() {
		
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='1. Dialog']")).click();
		driver.findElement(MobileBy.xpath("//android.widget.Button[@text='CHANGE THE DATE']")).click();
		
	}
	
	@Test(priority=3, dependsOnMethods={"DatePicker1"})
	public void testChangeDate() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='2021']")).click();
		Thread.sleep(1000);	
	
		
		//Selecting the year
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/date_picker_year_picker\")).flingToBeginning(3).scrollIntoView(new UiSelector().textContains(\"1994\"));"));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/date_picker_year_picker\")).scrollToBeginning(3).scrollIntoView(new UiSelector().textContains(\"1994\"));"));
		try {
			driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='1994']")).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Could Found the Element");
		}
		
		Thread.sleep(2000);
		
		//Select the date and month
		AndroidElement date =  driver.findElement(MobileBy.xpath("//android.view.View[@text='3']"));
		date.click();
		String content = date.getAttribute("content-desc");
		
		for(int i=1;i<=25;i++){
			System.out.println(content);
			if(content.contains("March")){
				System.out.println("content desc "+content);
				break;
			}else{
				driver.findElementById("android:id/next").click();
				date.click();
				content = date.getAttribute("content-desc");
				Thread.sleep(1000);
			}
		}
		
	}



	@AfterTest
	public void stopServer() {
		server.stop();
	}

}
