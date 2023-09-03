package HomePageExtension;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.HomePage;

import TestComponents.Base;

public class HomePageActivity extends Base {

	@Test
	public void search() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		HomePage homePage = new HomePage(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homePage.searchBarField(testDataHelper.getValue("search_text"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    homePage.clickSearchBox();
		
	}

}
