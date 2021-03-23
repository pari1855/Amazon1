package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class Practice extends BaseClass{
	@BeforeClass
	public void setup() {
		try {
			driverInitialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1() {
		System.out.println("The Url of the Page is: "+driver.getCurrentUrl());
		System.out.println("Title is: "+ driver.getTitle());
	}
	@Test
	public void Test2() {
	driver.findElement(By.xpath("//a[@class='g-menu-item-container' and @href='/blog/']")).click();
	String URL= driver.getCurrentUrl();
	System.out.println(URL);
	String title = driver.getTitle();
}
}
