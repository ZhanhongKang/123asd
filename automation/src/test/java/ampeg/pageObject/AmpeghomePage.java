package ampeg.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmpeghomePage extends PageObject{

	public AmpeghomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}
	
	public productPage clickProduct() {
		WebElement element = driver.findElement(By.xpath("//div[@id='global-topnav']//a[@class='main-item products']"));
		element.click();
		
		return new productPage(driver, baseUrl);
	}
	

}
