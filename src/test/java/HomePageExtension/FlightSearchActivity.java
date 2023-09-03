package HomePageExtension;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.FlightSearchPage;
import TestComponents.Base;

public class FlightSearchActivity extends Base {
	
	@Test
	public void flightSearch() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		FlightSearchPage fsp = new FlightSearchPage(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		fsp.click_flight_booking_link();
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				fsp.countryField(testDataHelper.getValue("country"));
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

}
