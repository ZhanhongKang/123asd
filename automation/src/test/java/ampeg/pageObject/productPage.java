package ampeg.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class productPage extends PageObject {

	public productPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public classicPage clickClassic() {
		
		WebElement element = driver.findElement(By.xpath("//a[contains(@href, '/products/classic/')]"));
		element.click();
		
		return new classicPage(driver, baseUrl);
	}
	
}
