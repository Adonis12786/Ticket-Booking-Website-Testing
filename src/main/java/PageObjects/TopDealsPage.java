package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class TopDealsPage extends CommonUtilities {
WebDriver driver;
	
	public TopDealsPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Now we will find the xpath of required element
	@FindBy(xpath="//a[@href = '#/offers']")
	private WebElement top_deals;
	
	@FindBy(xpath="//input[@id='search-field']")
	private WebElement topdeals_searchfield;
	
	@FindBy(xpath="//select[@id='page-menu']")
	public WebElement menu_button;
	
	public void clickTopDeals() {
		top_deals.click();
	}
	
	public void searchBarField(String name)
	{
		topdeals_searchfield.sendKeys(name);
	}
	

}
