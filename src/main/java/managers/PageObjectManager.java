package managers;

import pageObjects.homePage;
import pageObjects.PaymentPage;

import org.openqa.selenium.WebDriver;

import pageObjects.AddressPage;
import pageObjects.CheckoutPage;
import pageObjects.loginPage;
import pageObjects.ProductListingPage;
import pageObjects.ProductPage;
import pageObjects.WishlistPage;

public class PageObjectManager {

	private WebDriver driver;

	private AddressPage addressPage;
	private homePage homePage;
	private PaymentPage paymentPage;
	private CheckoutPage checkoutPage;
	private loginPage loginPage;
	private ProductListingPage productListingPage;
	private ProductPage productPage;
	private WishlistPage wishlistPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public homePage getHomePage(){

		return (homePage == null) ? homePage = new homePage(driver) : homePage;

	}
	
	public loginPage getLoginPage(){

		return (loginPage == null) ? loginPage = new loginPage(driver) : loginPage;

	}
	
	public AddressPage getAddressPage(){

		return (addressPage == null) ? addressPage = new AddressPage(driver) : addressPage;

	}
	
	public PaymentPage getPaymentPage(){

		return (paymentPage == null) ? paymentPage = new PaymentPage(driver) : paymentPage;

	}
	
	public CheckoutPage getCheckoutPage(){

		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;

	}
	
	public ProductListingPage getProductListingPage(){

		return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;

	}
	
	public ProductPage getProductPage(){

		return (productPage == null) ? productPage = new ProductPage(driver) : productPage;

	}
	
	public WishlistPage getWishlistPage(){

		return (wishlistPage == null) ? wishlistPage = new WishlistPage(driver) : wishlistPage;

	}

}
