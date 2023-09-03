package HomePageExtension;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.HolidayPackagesPage;
import PageObjects.TopDealsPage;
import TestComponents.Base;

public class HolidayPageActivity extends Base {
	
	@Test
	public void holiday() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		HolidayPackagesPage holiday = new HolidayPackagesPage(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parenthandle = driver.getWindowHandle();
		holiday.click_flight_booking_link();
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				holiday.click_holidayPackage_link();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				holiday.destinationCity(testDataHelper.getValue("destinationcity"));
				holiday.departureCity(testDataHelper.getValue("departurecity"));
				holiday.returnCity(testDataHelper.getValue("returncity"));
				holiday.click_submit_button();
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		
	}
	

}
