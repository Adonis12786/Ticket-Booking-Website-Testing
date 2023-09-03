package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class HotelsCheckPage extends CommonUtilities {
	WebDriver driver;
	
	public HotelsCheckPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Now we will find the xpath of required element
	@FindBy(xpath="//a[@href='https://rahulshettyacademy.com/dropdownsPractise/']")
	private WebElement flight_booking_link;
	
	@FindBy(xpath="//span[@style='position: relative; top: 3px;']")
	private WebElement hotels_link;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_txtOriginStation1_MST']")
	private WebElement destinationcity_field;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_ButtonSubmit_MST']")
	private WebElement search_button;
	
	public void click_flight_booking_link() {
		flight_booking_link.click();
	}
	
	public void click_hotels_link() {
		hotels_link.click();
	}
	
	public void destinationCityField(String destination_city) {
		destinationcity_field.sendKeys(destination_city);
	}
	
	public void click_search_button() {
		search_button.click();
	}
	
		

}
