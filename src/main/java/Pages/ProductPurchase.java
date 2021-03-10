package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class ProductPurchase extends BaseClass{

		@FindBy(id ="twotabsearchtextbox") WebElement searchBar;
		@FindBy(className="nav-input") WebElement submitBtn;
		
		public void enterProductName(String productName) {
			searchBar.sendKeys(productName);
		}
		public ProductPurchase() {
			PageFactory.initElements(driver, this);
		}
		
	public void clickSearchBtn() {
	submitBtn.click();
	}
		
}
