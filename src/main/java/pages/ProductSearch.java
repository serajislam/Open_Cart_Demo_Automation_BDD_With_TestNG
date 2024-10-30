package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import utils.CommonMethod;
import utils.Constants;

public class ProductSearch extends BaseClass{
	
	private CommonMethod commonMethod;
	public ProductSearch(WebDriver driver) {
		super();
		
		PageFactory.initElements(BaseClass.webDriver.get(), this);
		PageFactory.initElements(driver,this);
		commonMethod = new CommonMethod(driver);
	}
	
	//Product Search Send key  
		@FindBy(xpath = "//input[@placeholder='Search']")
		private WebElement searchByProductName;
		
		//Product Search Button
		@FindBy(xpath = "//button[@class='btn btn-light btn-lg']")
		private WebElement clkOnSearchBtn;
		
		
		public void ProductSearchByName(String productName) throws Exception {
			
			
			commonMethod.sendKey(searchByProductName,productName,Constants.EXPLICIT_WAIT_TIME);
			log.info("Product Name Entered");

		}
		
        public void ClkOnProdBtn(){
			
			
			commonMethod.clickonElement(clkOnSearchBtn,Constants.EXPLICIT_WAIT_TIME);
			log.info("Clicked On Search");

		}

}



