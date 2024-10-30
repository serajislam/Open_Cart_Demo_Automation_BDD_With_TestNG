package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utils.CommonMethod;
import utils.Constants;

public class CheckOutPage extends BaseClass{
	
    private CommonMethod commonMethod;
	public CheckOutPage(WebDriver driver) {
		super();
		
		PageFactory.initElements(BaseClass.webDriver.get(), this);
		PageFactory.initElements(driver,this);
		commonMethod = new CommonMethod(driver);
	}
	
	   // Add To Cart Icon
		@FindBy(xpath = "(//i[@class='fa-solid fa-shopping-cart'])[1]")
		private WebElement clkOnAddToCartIcon;
		//div[@id='content']//div[1]//div[1]//div[2]//form[1]//div[1]//button[1]//i[1]
		
		
		
		// Add To Cart Page
		@FindBy(xpath = "//input[@id='input-option-value-17']")
		private WebElement clkOnChkbox;
		
		@FindBy(css = "#button-cart")
		private WebElement clkOnAddToCartBtn;
		
		
		
		
		// Check Out
		@FindBy(xpath = "//strong[normalize-space()='Checkout']")
		private WebElement clkOnChkouttBtn;
		
		
		//Shipping Address
		
		@FindBy(xpath = "//input[@id='input-shipping-existing']")
		private WebElement extAddressBtn;
		
		@FindBy(xpath = "//input[@id='input-shipping-new']")
		private WebElement clkOnNewAddressBtn;
		
		@FindBy(xpath = "//input[@id='input-shipping-firstname']")
		private WebElement firstName;
		
		@FindBy(xpath = "//input[@id='input-shipping-lastname']")
		private WebElement lastName;
		
		@FindBy(xpath = "//input[@id='input-shipping-address-1']")
		private WebElement address;
		
		@FindBy(xpath = "//input[@id='input-shipping-city']")
		private WebElement city;
		
		@FindBy(xpath = "//input[@id='input-shipping-postcode']")
		private WebElement zipCode;
		
		@FindBy(xpath = "//select[@id='input-shipping-country']")
		private WebElement country;
		
		@FindBy(xpath = "//select[@id='input-shipping-zone']")
		private WebElement state;
		
		@FindBy(xpath = "//button[@id='button-shipping-address']")
		private WebElement cont;
		
		
		//Shipping Method
		@FindBy(xpath = "//button[@id='button-shipping-methods']")
		private WebElement chooseShipingMtd;
		
		@FindBy(xpath = "//input[@id='input-shipping-method-flat-flat']")
		private WebElement chooseRate;
		
		@FindBy(xpath = "//button[@id='button-shipping-method']")
		private WebElement chooseRateCon;
		
		//Payment Method
		@FindBy(xpath = "//button[@id='button-payment-methods']")
		private WebElement choosePayMtd;
		
		@FindBy(xpath = "//input[@id='input-payment-method-bank_transfer-bank-transfer']")
		private WebElement choosePayType;
		
		@FindBy(xpath = "//button[@id='button-payment-method']")
		private WebElement choosePayTypeCon;
		
		// Order confirm 
		@FindBy(xpath = "//button[@id='button-confirm']")
		private WebElement confOrder;
		
		@FindBy(xpath = "//a[normalize-space()='Continue']")
		private WebElement confOrderCon;
		
	public void addToCartIcon() throws InterruptedException{
		
		//Scroll into view element
		 //JavascriptExecutor je = (JavascriptExecutor) driver;
		 //je.executeScript("arguments[0].scrollIntoView(true);",clkOnAddToCartIcon);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clkOnAddToCartIcon);
		Thread.sleep(5000);
		
		commonMethod.clickonElement(clkOnAddToCartIcon, Constants.EXPLICIT_WAIT_TIME);
		
	}
	
	public void addToCartBtn () throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clkOnChkbox);
		commonMethod.clickonElement(clkOnChkbox, Constants.EXPLICIT_WAIT_TIME);
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clkOnAddToCartBtn);
		Thread.sleep(5000);
		commonMethod.waitforvisibilityofelement(clkOnAddToCartBtn, Constants.EXPLICIT_WAIT_TIME);
		commonMethod.clickonElement(clkOnAddToCartBtn, Constants.EXPLICIT_WAIT_TIME);
		
		Thread.sleep(5000);
		
	}
	
	public void checkOut() {
		
		/*
		 * String winHandleBefore = driver.getWindowHandle();
		 * 
		 * Switch to new window opened for(String winHandle :
		 * driver.getWindowHandles()){ driver.switchTo().window(winHandle); }
		 */
		commonMethod.switchToNewWindow(driver);
		// Performing the actions on new window
		commonMethod.clickonElement(clkOnChkouttBtn, Constants.EXPLICIT_WAIT_TIME);
		
	}

}
