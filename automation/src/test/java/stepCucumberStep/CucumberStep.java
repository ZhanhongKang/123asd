package stepCucumberStep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ampeg.pageObject.AmpeghomePage;
import ampeg.pageObject.productPage;
import ampeg.pageObject.svt410hlf;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CucumberStep {

	WebDriver driver = null;
	String url = "https://ampeg.com/";
	
	@Given("on home page")
	public void gohomepage() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
	@When("I clcik the product page")
	public void clickproductp5age() {
		new AmpeghomePage( driver,url).clickProduct();
	}
	
	@And ("at the product page I clcik classic page")
public void clickproduct4page() {
		new productPage(driver,url).clickClassic();
		
	}
	@And ("click 410 product page and get product detail")
public void clickproductp3age() {
		new svt410hlf(driver,url).clickproduct410();
	}
	@Then("close the brower")
public void clickproductp2age() {
	driver.close();
}
	
	
	
}
