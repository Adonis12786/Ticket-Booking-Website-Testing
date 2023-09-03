package HelperPages;

import java.time.Duration;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelper {
	
	public WebDriver driver;  
	public TestDataHelper testDataHelper;
	String BROWSER;
	String host;
	MutableCapabilities dc;
	
		
	public WebDriver getWebDriver() throws Exception {
		testDataHelper = new TestDataHelper();
		BROWSER = testDataHelper.getValue("browser");
		//BROWSER = chrome;

		if (BROWSER.equalsIgnoreCase("chrome")) {
			// With the help of web driver manager you dont need to have driver setup file in your frameworks
			/*
			 * WebDriverManager is an open-source Java library that carries out the
			 * management (i.e., download, setup, and maintenance) of the drivers required
			 * by Selenium WebDriver (e.g., chromedriver, geckodriver, msedgedriver, etc.)
			 * in a fully automated manner.
			 */
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();		

		} else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
      


}
