package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@type = 'email']") 
	 private WebElement txtbx_Email;
	
	@FindBy(how = How.XPATH, using = "//*[@type = 'password']") 
	 private WebElement txtbx_Password;
	
	@FindBy(how = How.XPATH, using = "//*[@class = 'login-login-button']") 
	 private WebElement btn_Login;

}
