package stepDefinations;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStep  extends BaseClass{


	HomePage hp = new HomePage(driver);
	
	@Given("User should be on Open Cart Demo Page")
	public void user_should_be_on_open_cart_demo_page() {
	    
	}
	@When("Click On Desktop")
	public void click_on_desktop() throws InterruptedException {
		hp.Desktops();
		
	    
	}
	@Then("Click On Laptops & Notebooks")
	public void click_on_laptops_notebooks() throws InterruptedException {
		hp.laptoNotebooks();
	    
	}
	@Then("Click On Components")
	public void click_on_components() {
		hp.components();
	    
	}
	@Then("Click On Tablets")
	public void click_on_tablets() {
		hp.tablets();
	    
	}
	@Then("Click On Software")
	public void click_on_software() {
		hp.software();
	    
	}
	@Then("Click On Phones & PDAs")
	public void click_on_phones_pd_as() {
		hp.phones();
	    
	}
	@Then("Click On Cameras")
	public void click_on_cameras() {
		hp.cameras();
	    
	}
	@Then("Click On MP3 Players")
	public void click_on_mp3_players() {
		hp.mp3Players();
	    
	}
	
}
