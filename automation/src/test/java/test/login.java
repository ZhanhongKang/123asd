package test;

import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.blousePage;
import framework.TestBase;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class login extends TestBase{


	@Test
	public void fasdasd() throws InterruptedException {
		new HomePage(driver,baseUrl).addtocartTshits();

	}

	@Test
	public void searchBlouseProduct() {
		String expect = "Product successfully added to your shopping cart";
		
		blousePage actural = new HomePage(driver,baseUrl)
				.runSearch()
				.selectItem()
				.addToCart();
		
		assertEquals(expect, actural.grabText());	
	

	}
	
	@Test
	public void searchBlouseProduct1() {
		String expect = "There is 1 item in your cart.";
		
		blousePage actural = new HomePage(driver,baseUrl)
				.runSearch()
				.selectItem()
				.addToCart();
		
		assertEquals(expect, actural.grabText1());	

	}
}
