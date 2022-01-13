package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends PageObject {

	public HomePage(ChromeDriver driver, String baseUrl) {
		super(driver,baseUrl);
	}
	
	public HomePage addtocartTshits() throws InterruptedException {
		WebElement element= driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span"));
		
		element.click();
		TimeUnit.SECONDS.sleep(3);
		
		return new HomePage(driver,baseUrl);
			
				
	}

}
