package Appium.Framework;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Utilities {
	AndroidDriver<AndroidElement> driver;
	public boolean elementStatus(AndroidDriver<AndroidElement> driver) throws InterruptedException{
		this.driver = driver;
		boolean status = false;
		//driver.findElement(By.xpath("//*[@text='WebView3']"));
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@text='WebView3']"));
			status= false;
		} catch (Exception e) {
			status = true;
		}
		return status;
	}
	
	public List<AndroidElement> addElement(AndroidDriver<AndroidElement> driver,List<AndroidElement> subModules){
		this.driver = driver;
		if(subModules==null){
			subModules = driver.findElements(MobileBy.id("android:id/text1"));
		}else{
			subModules.addAll(driver.findElements(MobileBy.id("android:id/text1")));
		}
		return subModules;	
	}
	
	
}
