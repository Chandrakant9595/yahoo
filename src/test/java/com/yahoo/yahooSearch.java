package com.yahoo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class yahooSearch {
 
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  open();
  }
  
  @BeforeClass
 	public void testSetup() {
 		System.setProperty("webdriver.chrome.driver" , "D:\\Software\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
 		driver = new ChromeDriver(); 
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	}
 	
 	@AfterClass
 	public void tearDown() {
 		//driver.quit();
 	}


 public void open() throws InterruptedException{
 	  driver.get("https://in.yahoo.com/?p=us");
 	  
 	  driver.findElement(By.id("UHSearchBox")).click();
 	  Thread.sleep(1000);
 	  driver.findElement(By.id("UHSearchBox")).sendKeys("Selenium");
 	  Thread.sleep(5000);
 	  
 	  List <WebElement> list = driver.findElements(By.xpath(".//*[starts-with(@id,'yui_3_12_0_1_1476')]/a"));
 	  System.out.println(list.size());
 	  
 	  list.get(0).click();
 }
}
