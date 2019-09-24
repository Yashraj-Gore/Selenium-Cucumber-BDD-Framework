package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {
	WebDriver driver;
	
	public ProductListingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll(@FindBy(how = How.XPATH, using = "//img[contains(@src,'https://assets.myntassets.com/')]"))
	 private List<WebElement> prd_List;

}
