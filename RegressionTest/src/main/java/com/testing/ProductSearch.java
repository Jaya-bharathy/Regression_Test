package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ProductSearch {
 
	ChromeDriver driver = null;

	@BeforeClass
	public void beforeClass(){

	System.setProperty("webdriver.chrom.driver","C:\\Users\\bharathy\\Downloads\\chromedriver_win32\\chromdriver.exe");

	driver= new ChromeDriver();
	driver.get("http://amazon.in");
	}

	@Test
    public void testProductSearch(){
 	WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox")); 
	searchElement.sendKeys("Dream Catcher"); 
	driver.findElement(By.id("nav-search-submit-button")).click(); 
	WebElement searchResults = driver.findElement(By.linkText("Household and Decoration Products")); 
	assertNotNull(searchResults);
	 }

	@AfterClass
	public void afterClass(){
	// driver.quit();
		
	}
}
