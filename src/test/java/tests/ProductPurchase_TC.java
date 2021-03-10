package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import Pages.LandingPage;
import Pages.ProductPurchase;
import Utilities.BaseClass;

public class ProductPurchase_TC extends BaseClass {

		@BeforeTest
		public void setUp() throws Exception {
			driverInitialization();
		}
		@Test
		public void purchaseProduct() {
			ProductPurchase obj = new ProductPurchase();
			obj.enterProductName("Ear Phones");
			obj.clickSearchBtn();
			
		}
		
}
