package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class FlightSearchPage extends CommonUtilities {
	WebDriver driver;
	
	public FlightSearchPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Now we will find the xpath of required element
	@FindBy(xpath="//a[@href='https://rahulshettyacademy.com/dropdownsPractise/']")
	private WebElement flight_booking_link;
	
	@FindBy(xpath="//input[@id='autosuggest']")
	private WebElement country_field;
	
	public void click_flight_booking_link() {
		flight_booking_link.click();
	}
	
	public void countryField(String country) {
		country_field.sendKeys(country);
	}
	
		

}
