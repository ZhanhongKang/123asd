package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class PageObject {
	ChromeDriver driver;
	String baseUrl;
	public PageObject(ChromeDriver driver, String baseUrl) {
		this.driver=driver;
		this.baseUrl=baseUrl;
	}

}
