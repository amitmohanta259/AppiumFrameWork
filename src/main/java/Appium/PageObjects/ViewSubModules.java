package Appium.PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewSubModules {
	
	public ViewSubModules(AndroidDriver<AndroidElement> driver){
		PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Date Widgets']")
	AndroidElement date;
	
	public AndroidElement dateWidget(){
		return date;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
