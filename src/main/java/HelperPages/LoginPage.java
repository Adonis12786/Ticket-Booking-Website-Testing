package HelperPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonUtilities {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Now we will find the xpath of required element
	@FindBy(xpath="//a[@class='cart-header-navlink blinkingText']")
	private WebElement link;
	
	@FindBy(xpath="//a[@href='https://courses.rahulshettyacademy.com/sign_up']")
	private WebElement register_button;
	
	@FindBy(xpath="//a[@href='/secure/9521/identity/login']")
	private WebElement login_button;
	
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement useremail;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@data-testid='login-button']")
	private WebElement finallogin_button;
	
	public void click_Link() {
		link.click();
	}
	
	public void click_registerButton() {
		register_button.click();
	}
	
	
	public void click_loginButton() {
		login_button.click();
	}
	
	public void useremailField(String user_email) {
		useremail.sendKeys(user_email);
	}
	
	public void passwordField(String user_password) {
		password.sendKeys(user_password);
	}
	
	public void final_loginButton() {
		finallogin_button.click();
	}
	
	
	
	

}
