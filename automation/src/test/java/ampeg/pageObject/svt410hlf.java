package ampeg.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class svt410hlf extends PageObject{

	public svt410hlf(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public String clickproduct410() {
		
		WebElement elemetn= driver.findElement(By.xpath("//div[@class='specsCopy']"));
		
		//WebElement elemetn= driver.findElement(By.xpath("//*[@id=\"specs\"]/div/b[15]"));
		//*[@id="specs"]/div/b[15]
		String[] segments = elemetn.getText().split("\n");
		
	
		return segments[segments.length-1];
	}

}
