package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	WebDriver driver;
	
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@class='desktop-userTitle' and text()='Profile']") 
	 private WebElement label_Profile;
	
	@FindBy(how = How.XPATH, using = "//*[@class='desktop-userTitle' and text()='Bag']") 
	 private WebElement label_Bag;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "//*[@href='/login?referer=https://www.myntra.com/']") 
	 private WebElement buttonLink_Login;
	
	@FindBy(how = How.XPATH, using = "//*[@class='desktop-searchBar']") 
	 private WebElement txtbx_Search;
	

	
	public void clickLoginLink() {
		buttonLink_Login.click();
	}
}
