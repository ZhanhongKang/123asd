package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageObject {

	public HomePage(ChromeDriver driver, String baseUrl) {
		super(driver,baseUrl);
	}
	
//this statement for running action only
/*	public HomePage addtocartTshits() throws InterruptedException {
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\\\\\\\"homefeatured\\\\\\\"]/li[1]/div/div[2]/div[2]/a[1]"));
		action.moveToElement(we).perform();
		
		WebElement element= driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span"));
		element.click();
		
		
		return new HomePage(driver,baseUrl);
			
				
	}*/
	
	public HomePage runSearch(){
		WebElement search = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		search.sendKeys("Blouse");
		
		WebElement searchBut = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
		searchBut.click();
				
		
		
		return new HomePage(driver,baseUrl);			
	}
	
	public blousePage selectItem() {
		
		WebElement item = driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/a/img"));
		item.click();
		
		return new blousePage(driver, baseUrl);
	}

}
