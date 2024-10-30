package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import io.cucumber.java.en.Then;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.ProductSearch;


public class CheckOutPageStep extends BaseClass{
	
	LoginPage lp = new LoginPage(driver);
	ProductSearch ps = new ProductSearch(driver);
	CheckOutPage chkout = new CheckOutPage(driver);
	

	@Then("Enter {string} & {string} Credentials & Click on Login")
	public void enter_credentials_click_on_login(String userName, String password) throws Exception {
		lp.enterUsersId(userName, password);
		lp.login();
	    
	}
	
	

	@Then("Search By Product Name {string}")
	public void search_by_product_name(String productName) throws Exception {
		ps.ProductSearchByName(productName);
		ps.ClkOnProdBtn();
	    
	}
	

	@Then("Click On Busket Icon To Add Cart")
	public void click_on_busket_icon_to_add_cart() throws InterruptedException {
	    chkout.addToCartIcon();
	}

	@Then("Click On Add To Cart Btn")
	public void click_on_add_to_cart_btn() throws InterruptedException {
		chkout.addToCartBtn();
	}

	@Then("Click On Checkout Btn")
	public void click_on_checkout_btn() {
		chkout.checkOut();
	}

	@Then("Fill Up Shipping Address & Click On Continue")
	public void fill_up_shipping_address_click_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Fill Up Shipping Method & Click On Confirm Order")
	public void fill_up_shipping_method_click_on_confirm_order() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click On Continue")
	public void click_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
