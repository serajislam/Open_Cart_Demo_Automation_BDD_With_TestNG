package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import utils.Constants;
import utils.Util;

public class BaseClass{
	
	public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
	
	   public static WebDriver driver=null;
	   public static Logger log=LogManager.getLogger(BaseClass.class.getName());
	  
	   public static void launchDriver() throws IOException
		{
			if(Util.readProperties("browser").equalsIgnoreCase("chrome"))
			{
				
				
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//page is fully loaded then wait for before throwing the exception wait until time

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIME));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
			
			webDriver.set(driver);
			
			}
			
			else if (Util.readProperties("browser").equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				 driver = new FirefoxDriver();

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIME));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
				
				
				webDriver.set(driver);
			}
			else
			{
				System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIME));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
				
				
				webDriver.set(driver);
			}
			
			
			}
		
		public static void openURL(String url) {
	       
			webDriver.get().get(url);
			
	        }
		
		
		
		
		public static void tearDown()
		{
			
			webDriver.get().close();
			log.info("::::Active Browser is close::::");
			
		    webDriver.get().quit();
		    log.info("::::All Browser is quit::::");
		    log.info("*****************END OF LOG*******************");
		}
		
		
		

}
