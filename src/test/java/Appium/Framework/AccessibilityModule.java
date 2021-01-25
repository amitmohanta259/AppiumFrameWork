package Appium.Framework;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Appium.PageObjects.MainView;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AccessibilityModule extends Demo1{
	@BeforeTest
	public void startServer()
	{
		if(!localServer().isRunning() || server == null){
			localServer().start();
		}else{
			server=null;
		}
	}
	
	@Test
	public void verifySubModule() throws IOException, InterruptedException{
		AndroidDriver<AndroidElement> driver = capanilities();
		MainView view = new MainView(driver);
		view.accessibility().click();
		Thread.sleep(2000);
		List<AndroidElement> AccessibilitySubModules= driver.findElements(MobileBy.id("android:id/text1"));
		for (AndroidElement androidElement : AccessibilitySubModules) {
			System.out.println(androidElement.getText());
			androidElement.click();
			Thread.sleep(2000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(1000);
		}	
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	@AfterTest
	public void stoppServer(){
		server.stop();
	}

}
