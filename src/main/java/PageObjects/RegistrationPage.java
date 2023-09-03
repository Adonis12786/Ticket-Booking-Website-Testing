package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HelperPages.CommonUtilities;

public class RegistrationPage extends CommonUtilities {
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//Now we will find the xpath of required element
	@FindBy(xpath="//a[@class='cart-header-navlink blinkingText']")
	private WebElement link;
	
	@FindBy(xpath="//a[@href='https://courses.rahulshettyacademy.com/sign_up']")
	private WebElement register_button;
	
	@FindBy(xpath="//button[@value='email']")
	private WebElement email_button;
	
	@FindBy(xpath="//input[@id='user_name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='user_email']")
	private WebElement useremail;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='commit']")
	private WebElement signup_button;
	
	public void click_Link() {
		link.click();
	}
	
	public void click_registerButton() {
		register_button.click();
	}
	
	public void click_emailButton() {
		email_button.click();
		
	}
	
	public void usernameField(String user_name) {
		username.sendKeys(user_name);
	}
	
	public void useremailField(String user_email) {
		useremail.sendKeys(user_email);
	}
	
	public void passwordField(String user_password) {
		password.sendKeys(user_password);
	}
	
	public void click_signupButton() {
		signup_button.click();
	}
	
	
	
	
	
	
}
