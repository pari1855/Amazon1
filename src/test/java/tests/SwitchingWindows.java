package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class SwitchingWindows extends BaseClass {
		@BeforeClass
		public void SetUp() {
			try {
				driverInitialization();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Test
		public void multipleWindows() {
			String openNewLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			WebElement blogOption = driver.findElement(By.xpath("(//a[@href='/blog/'])[1]"));
			WebDriverWait wait = new WebDriverWait(driver, 10000);
			wait.until(ExpectedConditions.elementToBeClickable(blogOption));
			blogOption.sendKeys(openNewLink);
			String parent = driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			Iterator<String> iterator = allWindowHandles.iterator();
			while(iterator.hasNext()) {
				String childWindow = iterator.next();
				if(!parent.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				String url = driver.getCurrentUrl();
				System.out.println("child URL: "+url);
				String title = driver.getTitle();
				System.out.println("child title: "+title);
			}
			}
			driver.switchTo().window(parent);
			System.out.println("parent Url: "+driver.getCurrentUrl());
		}
		//Handling Pop up
		@Test
		public void handlingBrowserAlert() {
			driver.get("https://stackify.com/constructing-good-test-cases/");
			WebDriverWait ww = new WebDriverWait(driver, 10000);
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-31284\"]/div/div[2]/div/div/section/div/div/div/div/div/div[1]/div/div"));
			ww.until(ExpectedConditions.visibilityOfAllElements(ele));
			
			
		}
	
	
	
}
