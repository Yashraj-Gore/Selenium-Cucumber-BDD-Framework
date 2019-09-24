package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	WebDriver driver;
	
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'name']") 
	 private WebElement txtbx_name;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'mobile']") 
	 private WebElement txtbx_mobile;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'pincode']") 
	 private WebElement txtbx_pincode;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'streetAddress']") 
	 private WebElement txtbx_streetAddress;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'locality']") 
	 private WebElement txtbx_locality;
	
	@FindBy(how = How.XPATH, using = "//div[@class='addressFormUI-base-optionBtn'][1]") 
	 private WebElement drpDwn_locality;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'city']") 
	 private WebElement txtbx_city;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'state']") 
	 private WebElement txtbx_state;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'state']") 
	 private WebElement radioButton_office;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'addressFormUI-base-saveBtn')]") 
	 private WebElement btn_Save;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'desktop1-base-continueBtn')]") 
	 private WebElement btn_Continue;

}
