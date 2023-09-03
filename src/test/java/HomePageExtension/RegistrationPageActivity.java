package HomePageExtension;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.RegistrationPage;
import TestComponents.Base;

public class RegistrationPageActivity extends Base {

	@Test
	public void registration() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		RegistrationPage rp = new RegistrationPage(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		rp.click_Link();
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				rp.click_registerButton();
				rp.click_emailButton();
				rp.usernameField(testDataHelper.getValue("user_name"));
				rp.useremailField(testDataHelper.getValue("user_email"));
				rp.passwordField(testDataHelper.getValue("password"));
				rp.click_signupButton();
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
}
