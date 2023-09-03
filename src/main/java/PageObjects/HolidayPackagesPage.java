package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class HolidayPackagesPage extends CommonUtilities {
	WebDriver driver;
	
	public HolidayPackagesPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Now we will find the xpath of required element
	@FindBy(xpath="//a[@href='https://rahulshettyacademy.com/dropdownsPractise/']")
	private WebElement flight_booking_link;
	
	@FindBy(xpath="//a[@id='hlnkholidaypacks']")
	private WebElement holidayPackage_link;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	private WebElement destination_city;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_HolidayPackages_DropDownListFrom_CTXT']")
	private WebElement departure_city;
	
	@FindBy(xpath="//input[@id='ctl00_mainContent_HolidayPackages_DropDownListTo_CTXT']")
	private WebElement return_city;
	
	@FindBy(xpath="//input[@id='btnFindHolidays']")
	private WebElement submit_button;
	
	public void click_flight_booking_link() {
		flight_booking_link.click();
	}
	
	public void click_holidayPackage_link() {
		holidayPackage_link.click();
	}
	
	public void destinationCity(String destinationcity)
	{
		destination_city.sendKeys(destinationcity);
	}
	
	public void departureCity(String departurecity) {
		departure_city.sendKeys(departurecity);
	}
	
	public void returnCity(String returncity) {
		return_city.sendKeys(returncity);
	}
	public void click_submit_button() {
		submit_button.click();
	}
	

}
