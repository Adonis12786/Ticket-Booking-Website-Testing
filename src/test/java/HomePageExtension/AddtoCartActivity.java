package HomePageExtension;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.AddToCart;
import TestComponents.Base;

public class AddtoCartActivity extends Base {
	
	@Test
	public void addtocart() throws Exception {
		testDataHelper = new TestDataHelper();
		CommonTestData commonTestData = ctd.get();
		driver = commonTestData.getDriver();
		AddToCart atc = new AddToCart(driver);
		launchApplication();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		atc.click_addtocartButton();
		atc.click_addtocartIcon();
		atc.click_checkoutButton();
		atc.promocodeField(testDataHelper.getValue("promo_code"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		atc.click_applyButton();
		
		
	}

}
