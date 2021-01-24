package Appium.Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Demo1 {

	public static AppiumDriverLocalService server;
	
	public static AndroidDriver<AndroidElement> capanilities() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Appium\\Framework\\global.properties");
		Properties prop = new Properties();
		prop.load(fin);
		
		String deviceName = (String) prop.get("device");
		String appApk = (String) prop.get("appName");
		
		File src= new File("src\\main\\java\\Appium\\Framework");
		File appSrc = new File(src,appApk);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.APP, appSrc.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "0");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static AppiumDriverLocalService localServer(){
		server = AppiumDriverLocalService.buildDefaultService();
		return server;
	}
	

}
