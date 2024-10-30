package stepDefinations;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductSearch;

public class ProductSearchStep extends BaseClass{
	
	ProductSearch ps = new ProductSearch(driver);
	
	@When("Enter {string}")
	public void enter(String productName) throws Exception {
		ps.ProductSearchByName(productName);
	    
	}

	@Then("Click On Search")
	public void click_on_search() {
		ps.ClkOnProdBtn();
	    
	}

}
