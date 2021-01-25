package Appium.PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class viewSubModules {
	
	public viewSubModules(AndroidDriver<AndroidElement> driver){
		PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy(xpath="//*[@text='Animation']")
	AndroidElement animation;
	
	@AndroidFindBy(xpath="//*[@text='Auto Complete']")
	AndroidElement autoComplete;
	
	@AndroidFindBy(xpath="//*[@text='Buttons']")
	AndroidElement button;
	
	@AndroidFindBy(xpath="//*[@text='Chronometer']")
	AndroidElement chronometer;
	
	@AndroidFindBy(xpath="//*[@text='Controls']")
	AndroidElement controls;
	
	@AndroidFindBy(xpath="//*[@text='Custom']")
	AndroidElement custom;
	
	@AndroidFindBy(xpath="//*[@text='Drag and Drop']")
	AndroidElement dragDrop;
	
	@AndroidFindBy(xpath="//*[@text='Expandable Lists']")
	AndroidElement expandAbleList;
	
	@AndroidFindBy(xpath="//*[@text='Focus']")
	AndroidElement focus;
	
	@AndroidFindBy(xpath="//*[@text='Gallery']")
	AndroidElement gallery;
	
	@AndroidFindBy(xpath="//*[@text='Game Controller Input']")
	AndroidElement gameControllerInput;
	
	@AndroidFindBy(xpath="//*[@text='Grid']")
	AndroidElement grid;
	
	@AndroidFindBy(xpath="//*[@text='Hover Events']")
	AndroidElement hoverEvents;
	
	@AndroidFindBy(xpath="//*[@text='ImageButton']")
	AndroidElement imageButton;
	
	@AndroidFindBy(xpath="//*[@text='ImageSwitcher']")
	AndroidElement imageSwitcher;
	
	@AndroidFindBy(xpath="//*[@text='ImageView']")
	AndroidElement imageView;
	
	@AndroidFindBy(xpath="//*[@text='Layouts']")
	AndroidElement layouts;
	
	@AndroidFindBy(xpath="//*[@text='Lists']")
	AndroidElement lists;
	
	@AndroidFindBy(xpath="//*[@text='Picker']")
	AndroidElement picker;
	
	@AndroidFindBy(xpath="//*[@text='Popup Menu']")
	AndroidElement popupMenu;
	
	@AndroidFindBy(xpath="//*[@text='Layout Animation']")
	AndroidElement layOutAnimation;
	
	@AndroidFindBy(xpath="//*[@text='Progress Bar']")
	AndroidElement progressBar;
	
	@AndroidFindBy(xpath="//*[@text='Radio Group']")
	AndroidElement radioGroup;
	
	@AndroidFindBy(xpath="//*[@text='Rotating Button']")
	AndroidElement rotatingButton;
	
	@AndroidFindBy(xpath="//*[@text='ScrollBars']")
	AndroidElement scrollBar;
	
	@AndroidFindBy(xpath="//*[@text='Search View']")
	AndroidElement searchView;
	
	@AndroidFindBy(xpath="//*[@text='Secure View']")
	AndroidElement secureView;
	
	@AndroidFindBy(xpath="//*[@text='Seek Bar']")
	AndroidElement seekBar;
	
	@AndroidFindBy(xpath="//*[@text='Spinner']")
	AndroidElement spinner;
	
	@AndroidFindBy(xpath="//*[@text='Splitting Touches across Views']")
	AndroidElement splitting;
	
	@AndroidFindBy(xpath="//*[@text='Switches']")
	AndroidElement switches;
	
	@AndroidFindBy(xpath="//*[@text='System UI Visibility']")
	AndroidElement systemUIVisibility;
	
	@AndroidFindBy(xpath="//*[@text='Tabs']")
	AndroidElement tab;
	
	@AndroidFindBy(xpath="//*[@text='TextClock']")
	AndroidElement textClock;
	
	@AndroidFindBy(xpath="//*[@text='TextFields']")
	AndroidElement textFields;
	
	@AndroidFindBy(xpath="//*[@text='TextSwitcher']")
	AndroidElement textSwitcher;
	
	@AndroidFindBy(xpath="//*[@text='Visibility']")
	AndroidElement visibility;
	
	@AndroidFindBy(xpath="//*[@text='WebView']")
	AndroidElement webview;
	
	@AndroidFindBy(xpath="//*[@text='WebView2']")
	AndroidElement webView2;
	
	@AndroidFindBy(xpath="//*[@text='Date Widgets']")
	AndroidElement date;
	
	public AndroidElement dateWidget(){
		return date;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
