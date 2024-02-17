package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Project4  {
	
	public static void main(String[]args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//a[text()='Tokyo Talkies']")).click();
		
		driver.findElement(By.xpath("//select[@id='color']")).sendKeys("Black");
		

		driver.findElement(By.xpath("//select[@id='size']")).sendKeys("L");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).click();
		
		driver.findElement(By.xpath("//span[@class='cart-item has-items']")).click();
		
        driver.findElement(By.xpath("//input[@name='noo_coupon_code']")).sendKeys("VY36ZOH");
		
		driver.findElement(By.xpath("//button[@class='noo-apply-coupon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		
		WebElement First = driver.findElement(By.xpath("//input[@id='billing_first_name']"));
		First.click();
		First.sendKeys("nandha");//input[@id='billing_address_2']
		
		driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("//input[@id='billing_company']")).sendKeys("Greens");
		
		driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("3/61A ramasamy street");
		
		driver.findElement(By.xpath("//input[@id='billing_address_2']")).sendKeys("vellore");
		
		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("vellore");
		
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("632107");
		
		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("9345866702");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='billing_email']"));
		Email.sendKeys("nandhakumar91473@gmail.com");
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].scrollIntoView();",Email);
			
			js.executeScript("window.scrollBy(0,-700)");
			
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='I have read and agree to the website ']")).click();
		
		
		driver.findElement(By.xpath("//button[@id='place_order']")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\Screenshot\\Order.png");
		Files.copy(src, des);

		

		
	}

}
