package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class HomePage extends CommonUtilities {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Now we will find the xpath of required element
	@FindBy(xpath="//input[@class='search-keyword']")
	private WebElement search_bar_field;
	
	@FindBy(xpath="//button[@class='search-button']")
	private WebElement serach_box;
	
	public void searchBarField(String search_text)
	{
		search_bar_field.sendKeys(search_text);
	}
	
	public void clickSearchBox() {
		serach_box.click();
	}
	
	
	

}
