package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll(@FindBy(how = How.XPATH, using = "//p[@class='size-buttons-unified-size']"))
	 private List<WebElement> prd_SizeList;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'pdp-add-to-wishlist')]//span[2]") 
	 private WebElement btn_WishList;

}
