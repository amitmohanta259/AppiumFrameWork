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

public class EcomCapabilities{

	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {
		// TODO Auto-generated method stub
		//App Location
		
		FileInputStream srcLoc = new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\Appium\\Framework");
		Properties prop = new Properties();
		prop.load(srcLoc);

		File src = new File("src\\main\\java\\Appium\\Framework");
		File storeLoc = new File(src,(String) prop.get(appName));
		
		//DesiredCapabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP,storeLoc.getAbsolutePath());
		
		String deviceName = (String) prop.get("device");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		
		//Android driver 
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		return driver;
		
	}

}
