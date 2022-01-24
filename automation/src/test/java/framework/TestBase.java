package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public abstract class TestBase {

	protected String baseUrl;
	protected ChromeDriver driver ;

	@BeforeMethod
	public void setup() {
		baseUrl = "https://ampeg.com/index.html";
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedrivers.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void cleanup() {
		driver.close();
	}

}
