package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public abstract class TestBase {
  
	protected String baseUrl;
	protected ChromeDriver driver ;
	
  @BeforeMethod
  public void setup() {
	  baseUrl = "http://automationpractice.com/index.php";
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shawn\\eclipse-workspace\\automation\\src\\test\\resources\\chromedrivers.exe");
	   driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get(baseUrl);
	   
  }

  @AfterMethod
  public void cleanup() {
	  driver.close();
  }

}
