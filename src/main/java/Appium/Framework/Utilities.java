package Appium.Framework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


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
	
	public static void scrollDown(AndroidDriver<AndroidElement> driver) throws InterruptedException{
		Dimension size = driver.manage().window().getSize();
		int x  = size.getWidth()/2;
		int startY = (int) (size.getHeight()*0.9);
		int endY = (int) (size.getHeight()*0.1);
		
		TouchAction actions = new TouchAction(driver);
		actions.press(PointOption.point(x, startY))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(x,endY))
		.release().perform();
		Thread.sleep(500);
	}
	
	public static void scrollAndClick(By listItem , String Text ,AndroidDriver<AndroidElement> driver) throws InterruptedException{
		boolean flag = false;
		while(true){
			try {
				for(AndroidElement el:driver.findElements(listItem)){
					if(el.getAttribute("text").equals(Text)){
						el.click();
						flag=true;
						break;
					}
				}
				if(flag)
					break;
				else
					scrollDown(driver);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getStackTrace());
			}
			
		}
	}
	
	
}
