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

import com.google.common.io.Files;



public class Project3  {
	public static void main(String[]args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		driver.manage().window().maximize(); 
		
		WebElement Login = driver.findElement(By.xpath("//a[@href='/login']"));
		Login.click();
		
		WebElement Name = driver.findElement(By.xpath("//input[@name='email']"));
		Name.sendKeys("nandhakumar91473@gmail.com");
		
		WebElement PassWord = driver.findElement(By.xpath("//input[@name='password']"));
		PassWord.sendKeys("9345866702");
		
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		Submit.click();
		
		
		WebElement Mens = driver.findElement(By.xpath("//a[@data-parent='#accordian']"));
		
		
		
		Mens.click();
		
           JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",Mens);
		
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement Dress = driver.findElement(By.xpath("//a[@data-product-id='1']"));
				Dress.click();	
				
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();
	
	driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();
	
	driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Welcome");
	driver.findElement(By.xpath("//a[@href='/payment']")).click();
	
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Nandham");
	driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("0987345698762389");
	driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("7890");
	driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys("09");
	driver.findElement(By.xpath("//input[@name='expiry_year']")).sendKeys("2023");
	
	driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\Screenshot\\Shooping.png");
	Files.copy(src, des);

	 
	
	
		
       
	
		
		
		
		}

}
