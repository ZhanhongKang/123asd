package test;

import org.testng.annotations.Test;

import PageObject.HomePage;
import framework.TestBase;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class login extends TestBase{

	
  @Test
  public void fasdasd() throws InterruptedException {
	 new HomePage(driver,baseUrl).addtocartTshits();
	  
  }
  

}
