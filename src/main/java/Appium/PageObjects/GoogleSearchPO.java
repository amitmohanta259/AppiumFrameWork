package Appium.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPO {

	public GoogleSearchPO(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath="//input[@name='q' and @title='Search']")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@class='gNO89b' and @type='submit']")
	WebElement searchBtn; 
	
	public WebElement searchBox(){
		return searchBox;
	}
	public WebElement searchBtn(){
		return searchBtn;
	}
}
