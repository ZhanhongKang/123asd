package ampeg.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classicPage  extends PageObject {

	public classicPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public svt410hlf clicksvt410() {
		
		WebElement elemetn= driver.findElement(By.xpath("//*[@id=\"category\"]/p/a[12]"));
		//*[@id="category"]/p/a[12]
		elemetn.click();
		
		
		return  new svt410hlf(driver, baseUrl);
	}

}
