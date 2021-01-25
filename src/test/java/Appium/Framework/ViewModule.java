package Appium.Framework;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Appium.PageObjects.MainView;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ViewModule extends Demo1{
	//MainView homeView;
	MainView view;
	public AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void startServer() throws IOException
	{
		if(!localServer().isRunning() || server == null){
			localServer().start();
		}else{
			server=null;
		}
		
		driver = capanilities();
	}

	@Test
	public void countSubModules() throws IOException, InterruptedException{
		
		view = new MainView(driver);
		Utilities ut = new Utilities();
		//Set<AndroidElement> actualSubModules =null;
		view.views().click();
		Thread.sleep(2000);
		List<AndroidElement> subModules = null;
		subModules = ut.addElement(driver, subModules);
		Dimension size = driver.manage().window().getSize();
		int x  = size.getWidth()/2;
		int startY = (int) (size.getHeight()*0.9);
		int endY = (int) (size.getHeight()*0.1);
		
		
		TouchAction actions = new TouchAction(driver);
		while(ut.elementStatus(driver)!=false){
			actions.press(PointOption.point(x, startY))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(x,endY))
			.release().perform();
			Thread.sleep(500);
			subModules = ut.addElement(driver, subModules);
		}
		
		System.out.println("------------------------------------------------------------------");
		System.out.println(subModules.size());
	}
	
	
	
	@AfterTest
	public void stoppServer(){
		server.stop();
	}
}
