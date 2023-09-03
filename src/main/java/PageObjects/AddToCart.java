package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class AddToCart extends CommonUtilities{
WebDriver driver;
	
	public AddToCart(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Now we will find the xpath of required element
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	private WebElement addtocart_button;
	
	@FindBy(xpath="//img[@class=' ']")
	private WebElement addtocart_icon;
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	private WebElement checkout_button;
	
	@FindBy(xpath="//input[@class='promoCode']")
	private WebElement promocode_field;
	
	@FindBy(xpath="//button[@class='promoBtn']")
	private WebElement apply_button;
	
	public void click_addtocartButton() {
		addtocart_button.click();
	}
	
	public void click_addtocartIcon() {
		addtocart_icon.click();
	}
	
	public void click_checkoutButton() {
		checkout_button.click();
	}
	
	public void promocodeField(String promo_code) {
		promocode_field.sendKeys(promo_code);
	}
	
	public void click_applyButton() {
		apply_button.click();
	}
}
