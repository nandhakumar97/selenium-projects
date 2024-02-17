package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Project2 {
	public static void main(String[]args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//browser("chrome");
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		
		driver.findElement(By.xpath("//div[@class='product-action']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("VY28OZE5");
		
		WebElement Apply = driver.findElement(By.xpath("//button[@class='promoBtn']"));
		Apply.click();
		
		Thread.sleep(2000);
		WebElement Order = driver.findElement(By.xpath("//button[text()='Place Order']"));
		Order.click();
		
		WebElement Country = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Country.click();
		Select a = new Select(Country);
		a.selectByValue("India");
		
		Thread.sleep(2000);
		WebElement Check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Check.click();
		
		Thread.sleep(2000);
		WebElement Place = driver.findElement(By.xpath("//button[text()='Proceed']"));
		Place.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File des = new File("C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\Screenshot\\Shooping1.png");
    	Files.copy(src, des);
	
	}

}
