package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;
import utils.CommonMethod;
import utils.Constants;

public class AccountRegisterPage<IJavaScriptExecutor> extends BaseClass{
	
	private CommonMethod commonMethod;
	public AccountRegisterPage(WebDriver driver) {
		super();
		
		PageFactory.initElements(BaseClass.webDriver.get(), this);
		PageFactory.initElements(driver,this);
		commonMethod = new CommonMethod(driver);
	}
	
	
	
	//My Account Button 
		@FindBy(xpath = "//span[normalize-space()='My Account']")
		private WebElement clkOnMyAccBtnForReg;
		
		//Register Button
		@FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Register']")
		private WebElement clkOnRegBtn;
		
		//Register Page
		@FindBy(xpath = "//input[@id='input-firstname']")
		private WebElement firstName;
		
		@FindBy(xpath = "//input[@id='input-lastname']")
		private WebElement lastName;
		
		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement email;
		
		@FindBy(xpath = "//input[@id='input-password']")
		private WebElement password;
		
		//Terms & Condition
		@FindBy(xpath = "//input[@name='agree']")
		private WebElement tc;
		
		// Continue
		@FindBy(xpath = "//button[normalize-space()='Continue']")
		private WebElement continueBtn;
		
		//Assert after click on continue/after acc creation
		@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
		private WebElement accCreAssert;
		
		
		//Log Out
		@FindBy(xpath = "//span[normalize-space()='My Account']")
		private WebElement clkOnMyAccBtnForLogout;
		
		@FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Logout']")
		private WebElement clkOnLogoutBtn;
		
		//logout Assert
		@FindBy(xpath = "//h1[normalize-space()='Account Logout']")
		private WebElement logoutCreAssert;
		
		
		public void reg() throws IOException, InterruptedException {
			//Create an object of File class to open xls file
	        File file =    new File(".\\DataProvider\\TestData.xls");
	        
	        //Create an object of FileInputStream class to read excel file
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        //creating workbook instance that refers to .xls file
	        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
	        
	        //creating a Sheet object
	        HSSFSheet sheet=wb.getSheet("Regi_Data");
	        
	        //get all rows in the sheet
	        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	        
	      //iterate over all the rows in Excel and put data in the form.
	        for(int i=1;i<=rowCount;i++) {
	        	
	        	commonMethod.clickonElement(clkOnMyAccBtnForReg, Constants.EXPLICIT_WAIT_TIME);
	        	log.info("Clicked on My Account For Register");
	        	commonMethod.clickonElement(clkOnRegBtn, Constants.EXPLICIT_WAIT_TIME);
	        	log.info("Clicked on Register");
	            
	        	
	        	
	        	//Enter the values read from Excel in firstname,lastname,,email,password
				
				  firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
				  log.info("Entered First Name from Excel");
				  lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
				  log.info("Entered Last Name from Excel");
				  email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
				  log.info("Entered Email from Excel");
				  password.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
				  log.info("Entered Password from Excel");
				  
				  //Scroll into view element
				 //JavascriptExecutor je = (JavascriptExecutor) driver;
				 // je.executeScript("arguments[0].scrollIntoView(true);",tc);
				  
				  /*
				  Point p= tc.getLocation();
				  Actions actions = new Actions(driver);
				  actions.moveToElement(tc).moveByOffset(p.x,p.y).click().build().perform();
				  */
				 
				 // commonMethod.waitforelement(tc, Constants.EXPLICIT_WAIT_TIME).click();
				  
				  //JavascriptExecutor executor = (JavascriptExecutor)driver;
				 // executor.executeScript("arguments[0].click();", tc);
				 
				  //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				  //wait.until(ExpectedConditions.elementToBeClickable(tc));
				  
				  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tc);
				  Thread.sleep(5000);
				  log.info("Scroll down till element visible");
				  commonMethod.clickonElement(tc, Constants.EXPLICIT_WAIT_TIME);
				  log.info("Clcked on TC");
				  Thread.sleep(5000);
				  
				  //commonMethod.scrollTo(continueBtn);
		           commonMethod.clickonElement(continueBtn, Constants.EXPLICIT_WAIT_TIME);
		           log.info("Clcked on Continue");
		           Thread.sleep(5000);
		           
		           //Applying assert after account creation
		           String accCreationExpText = "Your Account Has Been Created!";
		           Assert.assertEquals(commonMethod.getText(accCreAssert, Constants.EXPLICIT_WAIT_TIME), accCreationExpText);
		           
		         
		          
		          //logout page
		          commonMethod.clickonElement(clkOnMyAccBtnForLogout, Constants.EXPLICIT_WAIT_TIME);
		  		  commonMethod.clickonElement(clkOnLogoutBtn, Constants.EXPLICIT_WAIT_TIME);
		  		  
		  		 //Applying assert after logout
		           String logoutExpText = "Account Logout";
		           Assert.assertEquals(commonMethod.getText(logoutCreAssert, Constants.EXPLICIT_WAIT_TIME), logoutExpText);
		  	
	            // Write the data back in the Excel file
	             FileOutputStream outputStream = new FileOutputStream(".\\DataProvider\\TestDataWriteByProg.xls");
	             wb.write(outputStream);

	        }
	        
	        //Close the workbook
	        wb.close();
	        
	    
			
		}
		
}
