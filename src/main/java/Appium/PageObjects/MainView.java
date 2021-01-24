package Appium.PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainView{
	
	public MainView(AndroidDriver<AndroidElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); // this refer to mainview class
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Access'ibility\"]")
	AndroidElement accessibility;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Accessibility']")
	AndroidElement accessibility1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Animation']")
	AndroidElement animation;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='App']")
	AndroidElement app;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Content']")
	AndroidElement content;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Graphics']")
	AndroidElement graphics;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Media']")
	AndroidElement media;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='NFC']")
	AndroidElement nfc;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='OS']")
	AndroidElement os;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	AndroidElement preference;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Text']")
	AndroidElement text;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Views']")
	AndroidElement view;
	
	
	public AndroidElement accessibility(){
		return accessibility;
	}
	
	public AndroidElement accessibility1(){
		return accessibility1;
		
	}
	
	public AndroidElement animation(){
		return animation;
		
	}
	
	public AndroidElement app(){
		return app;
		
	}
	
	public AndroidElement content(){
		return content;
		
	}
	
	public AndroidElement graphics(){
		return graphics;
		
	}
	
	public AndroidElement media(){
		return media;
		
	}
	
	public AndroidElement nfc(){
		return nfc;
		
	}
	
	public AndroidElement os(){
		return os;
		
	}
	
	public AndroidElement preference(){
		return preference;
		
	}
	
	public AndroidElement text(){
		return text;
		
	}
	
	public AndroidElement views(){
		return view;	
	}
}
