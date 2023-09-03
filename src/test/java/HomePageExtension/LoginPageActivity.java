package HomePageExtension;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.LoginPage;
import HelperPages.TestDataHelper;
import TestComponents.Base;

public class LoginPageActivity extends Base {
	
	@Test
	public void login() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		LoginPage lp = new LoginPage(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		lp.click_Link();
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				lp.click_registerButton();
				lp.click_loginButton();
				lp.useremailField(testDataHelper.getValue("user_email"));
				lp.passwordField(testDataHelper.getValue("password"));
				lp.final_loginButton();
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

}
