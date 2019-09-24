package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='button-base-button ' and text() = 'Place Order']") 
	 private WebElement btn_PlaceOrder;
}
