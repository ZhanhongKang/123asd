package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class blousePage extends PageObject{

	public blousePage(ChromeDriver driver, String baseUrl) {
		super(driver,baseUrl);
	}
	
	public blousePage addToCart() {
		WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]"));
		addToCart.click();
		
		return new blousePage(driver,baseUrl);
		
	}
	public String grabText() {
		WebDriverWait wait = new WebDriverWait(this.driver,5);
		
	wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='layer_cart']"), "display", "block"));
	
		
		return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")).getText();
		
	}
	public String grabText1() {
		WebDriverWait wait = new WebDriverWait(this.driver,5);
		
		wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='layer_cart']"), "display", "block"));
		
		return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/h2")).getText();
	}
}
