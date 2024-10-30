package stepDefinations;

import java.io.IOException;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountRegisterPage;

public class AccountRegisterPageStep extends BaseClass{
	
	AccountRegisterPage acc = new AccountRegisterPage(driver);
	
	
	@When("Click On My Account then Register")
	public void click_on_my_account_then_register() {
	    
	}
	@Then("Fill Up ALL Info & Logout")
	public void fill_up_all_info_logout() throws IOException, InterruptedException {
		acc.reg();
	    
	}
}
