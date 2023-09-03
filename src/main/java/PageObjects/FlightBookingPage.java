package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class FlightBookingPage extends CommonUtilities {
	WebDriver driver;
	
	public FlightBookingPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Now we will find the xpath of required element
	@FindBy(xpath="//a[@href='https://rahulshettyacademy.com/dropdownsPractise/']")
	private WebElement flight_booking_link;
	
	@FindBy(xpath="//label[contains(text(),'Round Trip')]")
    private WebElement roundtrip_button;

    @FindBy(xpath="//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
    public WebElement departure;

    @FindBy(xpath="//a[contains(text(),'Amritsar (ATQ)')]")
    private WebElement departure_city;

    @FindBy(xpath="//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/"
    		+ "div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/"
    		+ "tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[2]/li[1]/a[1]")
    private WebElement arrival_city;




    @FindBy(xpath="//tbody/tr[1]/td[5]/a[1]")
    private WebElement depart_date;

    @FindBy(xpath="//input[@id='ctl00_mainContent_view_date2']")
    private WebElement return_date;

    @FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")
    private WebElement my_returnDate;

    @FindBy(xpath="//input[@id='ctl00_mainContent_btn_FindFlights']")
    private WebElement searchFlight;

    public void click_flight_booking_link() {
    	flight_booking_link.click();
    }
    public void click_roundtrip_button() {
    	roundtrip_button.click();
    }
    public void click_departure() {
    	departure.click();
    }
    public void click_departure_city() {
    	departure_city.click();
    }
    public void click_arrival_city() {
    	arrival_city.click();
    }

 

    public void click_depart_date() {
    	depart_date.click();
    }
    public void click_return_date() {
    	return_date.click();
    }
    public void click_my_returnDate() {
    	my_returnDate.click();
    }
    public void click_searchFlight() {
    	searchFlight.click();
    }

}
