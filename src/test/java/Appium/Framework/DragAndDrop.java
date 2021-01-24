package Appium.Framework;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDrop  extends Demo1{

	public static AndroidDriver<AndroidElement> driver;
	
	@Test
	public void dragAndDrop() throws IOException {
		// TODO Auto-generated method stub
		driver = capanilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		AndroidElement source =  driver.findElementsByClassName("android.view.View").get(0);
		AndroidElement destination = driver.findElementsByClassName("android.view.View").get(1);
		
		AndroidTouchAction ata = new AndroidTouchAction(driver);
		ata.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source))).moveTo(ElementOption.element(destination)).release().perform();
		
	}

}
