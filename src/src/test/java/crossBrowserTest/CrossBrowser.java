package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	WebDriver driver;//create reference variable of webDriver interface
	//FirefoxOptions firefoxoptions = new FirefoxOptions();//create object of the firefoxoptions class
	ChromeOptions chromeoptions = new ChromeOptions();//create object of the chromeoptions class
	EdgeOptions edgeoptions = new EdgeOptions();//create object of the edgeoptions class
	
  @Parameters("browser")
  @BeforeTest
  public void initialize(String browser) {
	
	  if(browser.equalsIgnoreCase("chrome")) { 
		  WebDriverManager.chromedriver().setup();//we are loaded chrome driver
		  driver = new ChromeDriver();
		  System.out.println("Chrome is launched");
	  }
	  else if(browser.equalsIgnoreCase("edge")) { 
		  WebDriverManager.edgedriver().setup();//we are loaded edge driver
		  driver = new EdgeDriver();
		  System.out.println("Edge is launched");
	  }
  }
  @Test
  public void citibanklogin() {
	  driver.get("https://www.citi.com");
	  //String actual = driver.getTitle();
	 // String expected = "citi";
	  //Assert.assertEquals(actual.contains("citi"), expected.contains("citi"));
  }
  @AfterTest
  public void endTest() {
	  driver.quit();
  }
}
