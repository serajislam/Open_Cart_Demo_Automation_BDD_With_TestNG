package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utils.CommonMethod;
import utils.Constants;

public class LoginPage extends BaseClass{
	
	private CommonMethod commonMethod;
	public LoginPage(WebDriver driver) {
		super();
		
		PageFactory.initElements(BaseClass.webDriver.get(), this);
		PageFactory.initElements(driver,this);
		commonMethod = new CommonMethod(driver);
	}
	
	//My Account Button 
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	private WebElement clkOnMyAccBtnForLogin;
	
	//Login Button
	@FindBy(xpath = "//a[normalize-space()='Login']")
	private WebElement clkOnLoginBtnForLogin;
	
	
	
	//Entering User name & Password
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement uName;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement PWD;
	
	//Login
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement clkOnLoginBtn;
	
	//Log Out
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	private WebElement clkOnMyAccBtnForLogout;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Logout']")
	private WebElement clkOnLogoutBtn;
	
	
	
	
	public void myAccount() {
		//commonMethod.clickonElement(clkOnMyAccBtnForLogin, Constants.EXPLICIT_WAIT_TIME);
		
		commonMethod.clickonElement(clkOnMyAccBtnForLogin, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on My Account Button For Login");
		commonMethod.clickonElement(clkOnLoginBtnForLogin, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on Login Button For Login");
		
	}
	
	public void enterUsersId(String userName, String password) throws Exception {
		
		
		commonMethod.sendKey(uName,userName,Constants.EXPLICIT_WAIT_TIME);
		log.info("User Name Entered");

		commonMethod.sendKey(PWD,password,Constants.EXPLICIT_WAIT_TIME);
		log.info("Password Entered");

	}
	
  public void login() throws Exception {

		commonMethod.clickonElement(clkOnLoginBtn, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on Login Button");
		Thread.sleep(5000);
		//commonMethod.alertAccept(driver);
		//log.info("Alert Accepted");
		
		
	}
	
	
	public void logOut() {
		commonMethod.clickonElement(clkOnMyAccBtnForLogout, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on My Account Button For Logout");
		commonMethod.clickonElement(clkOnLogoutBtn, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on Log out");
		
		
	}
	
	
	
	
	
	

}
