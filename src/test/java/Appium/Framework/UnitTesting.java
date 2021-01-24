package Appium.Framework;

import java.awt.List;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import Appium.PageObjects.MainView;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class UnitTesting extends Demo1{
	@Test
	public void mainViewUnitTest() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = capanilities();
		MainView view= new MainView(driver);
		//view.accessibility().click();
		Method[] methods= view.getClass().getDeclaredMethods();
//		int totalElemnts = methods.length;
		for (Method method : methods) {
			System.out.println("Method name "+method.getName());
		}
		view.accessibility().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.accessibility1().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.animation().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.app().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.content().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.graphics().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.media().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.nfc().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.os().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.preference().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.text().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		view.views().click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
}
