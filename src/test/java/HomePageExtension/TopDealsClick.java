package HomePageExtension;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.HomePage;
import PageObjects.TopDealsPage;
import TestComponents.Base;

public class TopDealsClick extends Base {
	
	@Test
	public void topdeals() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		TopDealsPage topdeals = new TopDealsPage(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		topdeals.clickTopDeals();
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				topdeals.searchBarField(testDataHelper.getValue("name"));
				Select dropdown = new Select(topdeals.menu_button);
				dropdown.selectByVisibleText("10");
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		
	}

}
