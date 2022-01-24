package ampeg.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class PageObject {
	ChromeDriver driver;
	String baseUrl;
	public PageObject(WebDriver driver2, String baseUrl) {
		this.driver=(ChromeDriver) driver2;
		this.baseUrl=baseUrl;
	}

}
