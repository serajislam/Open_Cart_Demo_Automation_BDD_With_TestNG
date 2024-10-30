package stepDefinations;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStep extends BaseClass{
	
	LoginPage lp = new LoginPage(driver);
	
	@When("Click On My Account then Login")
	public void click_on_my_account_then_login() {
		lp.myAccount();
		
	    
	}

	@Then("Enter {string} & {string}")
	public void enter(String userName, String password) throws Exception {
		lp.enterUsersId(userName, password);
	    
	}

	@Then("Click On Login Button")
	public void click_on_login_button() throws Exception {
		lp.login();
	    
	}

	@Then("Click On Log Out")
	public void click_on_log_out() {
		lp.logOut();
	    
	}
	

}
