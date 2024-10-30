package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;
import utils.CommonMethod;
import utils.Constants;
import org.testng.Assert;

public class HomePage extends BaseClass {

	private CommonMethod commonMethod;

	public HomePage(WebDriver driver) {
		super();

		PageFactory.initElements(BaseClass.webDriver.get(), this);
		PageFactory.initElements(driver, this);
		commonMethod = new CommonMethod(driver);
	}

	// Desktops
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][normalize-space()='Desktops']")
	private WebElement mouHoverOnDesk;

	@FindBy(xpath = "//a[normalize-space()='Show All Desktops']")
	private WebElement clkOnShowAllDesk;

	// Desktops page Assertion
	@FindBy(xpath = "//h2[normalize-space()='Desktops']")
	private WebElement deskAssert;

	//Laptops & Notebooks
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	private WebElement mouHoverOnLaptop;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement clkOnShowAllLaptop;

	//Laptops & Notebooks page Assertion
	@FindBy(xpath = "//h2[normalize-space()='Laptops & Notebooks']")
	private WebElement laptopkAssert;
	
	//Components
	@FindBy(xpath = "//a[normalize-space()='Components']")
	private WebElement mouHoverOnComp;

	@FindBy(xpath = "//a[normalize-space()='Show All Components']")
	private WebElement clkOnShowAllComp;
	
	//Components page Assertion
	@FindBy(xpath = "//h2[normalize-space()='Components']")
	private WebElement compAssert;
	
	//Tablets
	@FindBy(xpath = "//a[normalize-space()='Tablets']")
	private WebElement clkOnTab;
	
	//Tablets page Assertion
	@FindBy(xpath = "//h2[normalize-space()='Tablets']")
	private WebElement tabAssert;
	
	//Software
	@FindBy(xpath = "//a[normalize-space()='Software']")
	private WebElement clkOnSoft;
	
	//Software page Assertion
	@FindBy(xpath = "//h2[normalize-space()='Software']")
	private WebElement softAssert;
	
	//Phones & PDAs
	@FindBy(xpath = "//a[normalize-space()='Phones & PDAs']")
	private WebElement clkOnPhone;
	
	//Phones & PDAs page Assertion
	@FindBy(xpath = "//h2[normalize-space()='Phones & PDAs']")
	private WebElement phoneAssert;
	
	//Cameras
	@FindBy(xpath = "//a[normalize-space()='Cameras']")
	private WebElement clkOnCam;
	
	//Cameras & PDAs page Assertion
	@FindBy(xpath = "//h2[normalize-space()='Cameras']")
	private WebElement camAssert;
	
	//MP3 Players
	@FindBy(xpath = "	//a[normalize-space()='MP3 Players']")
	private WebElement mouHoverOnMP3	;

	@FindBy(xpath = "//a[normalize-space()='Show All MP3 Players']")
	private WebElement clkOnMP3;
	
	//MP3 Players page Assertion
	@FindBy(xpath = "//h2[normalize-space()='MP3 Players']")
	private WebElement mp3Assert;

	public void Desktops() throws InterruptedException{

		//Actions action = new Actions(driver);
		//action.moveToElement(mouOverOnDesk).perform();
		//action.moveToElement(clkOnShowAllDesk).click();

		// Calling mouseHoverAndClKk method from CommonMethod class. calling Constants class for wait

		commonMethod.mouseHoverAndClK(mouHoverOnDesk, Constants.EXPLICIT_WAIT_TIME);
		commonMethod.clickonElement(clkOnShowAllDesk, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on Show All Desktops");
		
		// Applying Assertion
		String expText = "Desktops";
		// WebElement deskAssert = driver.findElement(By.xpath("//h2[normalize-space()='Core']"));
		// String actText = deskAssert.getText();
		// Assert.assertEquals(aftClkOnScreenAssisFind,expText);

		Assert.assertEquals(commonMethod.getText(deskAssert, Constants.EXPLICIT_WAIT_TIME), expText);
		
		Thread.sleep(3000);
		//driver.navigate().back();

	}

	public void laptoNotebooks() throws InterruptedException{
		
		
		commonMethod.mouseHoverAndClK(mouHoverOnLaptop, Constants.EXPLICIT_WAIT_TIME);
		commonMethod.clickonElement(clkOnShowAllLaptop, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on Show All Laptops & Notebooks");
		
		// Applying Assertion
		String expText = "Laptops & Notebooks";
		Assert.assertEquals(commonMethod.getText(laptopkAssert, Constants.EXPLICIT_WAIT_TIME), expText);
	
	}

	public void components(){
		
		commonMethod.mouseHoverAndClK(mouHoverOnComp, Constants.EXPLICIT_WAIT_TIME);
		commonMethod.clickonElement(clkOnShowAllComp, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on Show All Components");
		
		// Applying Assertion
		String expText = "Components";
		Assert.assertEquals(commonMethod.getText(compAssert, Constants.EXPLICIT_WAIT_TIME), expText);
		

	}

	public void tablets() {
		
		commonMethod.clickonElement(clkOnTab, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on Tablets");
		
		// Applying Assertion
		String expText = "Tablets";
		Assert.assertEquals(commonMethod.getText(tabAssert, Constants.EXPLICIT_WAIT_TIME), expText);


	}

	public void software() {
		
       commonMethod.clickonElement(clkOnSoft, Constants.EXPLICIT_WAIT_TIME);
       log.info("Clicked on Software");
		
		// Applying Assertion
		String expText = "Software";
		Assert.assertEquals(commonMethod.getText(softAssert, Constants.EXPLICIT_WAIT_TIME), expText);


	}
	
	public void phones() {
		
	       commonMethod.clickonElement(clkOnPhone, Constants.EXPLICIT_WAIT_TIME);
	       log.info("Clicked on Phones & PDAs");
			
			// Applying Assertion
			String expText = "Phones & PDAs";
			Assert.assertEquals(commonMethod.getText(phoneAssert, Constants.EXPLICIT_WAIT_TIME), expText);


		}
	
	public void cameras() {
		
	       commonMethod.clickonElement(clkOnCam, Constants.EXPLICIT_WAIT_TIME);
	       log.info("Clicked on Cameras");
	       
			
			// Applying Assertion
			String expText = "Cameras";
			Assert.assertEquals(commonMethod.getText(camAssert, Constants.EXPLICIT_WAIT_TIME), expText);


		}

	public void mp3Players(){
		
		commonMethod.mouseHoverAndClK(mouHoverOnMP3, Constants.EXPLICIT_WAIT_TIME);
		commonMethod.clickonElement(clkOnMP3, Constants.EXPLICIT_WAIT_TIME);
		log.info("Clicked on Show All MP3 Players");
		
		// Applying Assertion
		String expText = "MP3 Players";
		Assert.assertEquals(commonMethod.getText(mp3Assert, Constants.EXPLICIT_WAIT_TIME), expText);
		
		

		
	}

}
