package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LandingPage;
import Utilities.BaseClass;

public class landingPage_TC extends BaseClass{

	@BeforeTest
	public void setUp() throws Exception {
		driverInitialization();
	}
	
	@Test
	public void TestComputer() {
		LandingPage obj = new LandingPage();
		obj.clickOnMenuOption("Computers");
		System.out.println("Click done.");
	}
	
}
