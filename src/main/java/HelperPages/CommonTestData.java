package HelperPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class CommonTestData {
	
	private WebDriver driver;
	private long threadID;
	private Logger log;
	
	public CommonTestData(WebDriver driver , long threadID,Logger log) {
		this.driver = driver;
		this.threadID = threadID;
		this.log= log;
		
	}
	public WebDriver getDriver() {
		return driver;
	}
	public long getthreadID() {
		return threadID;
	}
	public Logger getLogger() {
		return log;
	}

}
