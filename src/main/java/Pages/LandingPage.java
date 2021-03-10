package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LandingPage extends BaseClass{
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//div[@id='nav-xshop-container']/div/a") 
	List<WebElement> navBar;
	
	public void clickOnMenuOption(String enterNavOption) {
		//String firstXpath = "//div[@id='nav-xshop-container']/div/a[";
		//String middleXpath = "]";
		for(WebElement e: navBar) {
			if(e.getText().equalsIgnoreCase(enterNavOption)) {
				e.click();
				break;
			}
		}
	}
}
