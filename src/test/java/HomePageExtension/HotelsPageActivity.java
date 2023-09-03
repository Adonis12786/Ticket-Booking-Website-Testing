package HomePageExtension;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.HotelsCheckPage;
import TestComponents.Base;

public class HotelsPageActivity extends Base {
	
	@Test
	public void hotels() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		HotelsCheckPage hp = new HotelsCheckPage(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		hp.click_flight_booking_link();
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				hp.click_hotels_link();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				hp.destinationCityField(testDataHelper.getValue("destinationcity"));
				hp.click_search_button();
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

}
