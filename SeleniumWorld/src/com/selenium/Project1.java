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

public class Project1 {
	
	public static void main(String[]args) throws InterruptedException, IOException {
		//browser("chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Nandha187");
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("9345866702");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement Location = driver.findElement(By.xpath("//select[@id='location']"));
		Select a = new Select(Location);
		a.selectByIndex(2);
		
		WebElement Hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select a1 = new Select(Hotels);
		a1.selectByIndex(3);
		
		WebElement 	Room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select a2 = new Select(Room);
		a2.selectByIndex(2);
		
		WebElement Rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select a3 = new Select(Rooms);
		a3.selectByIndex(4);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepick_in').value='18/09/2023';");
		js.executeScript("document.getElementById('datepick_out').value='29/10/2023';");
		
		
		WebElement Date = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select a4 = new Select(Date);
		a4.selectByIndex(3);
		
		WebElement perRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select a5 = new Select(perRoom);
		a5.selectByIndex(2);
		
		WebElement serach = driver.findElement(By.name("Submit"));
		serach.click();
		
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
		
		WebElement next = driver.findElement(By.name("continue"));
		next.click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstName.sendKeys("nandha");
	
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastName.sendKeys("kumar");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("361araja chennai 238017");
		
		WebElement cdNumber = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cdNumber.sendKeys("187374245455400126");
		
		WebElement type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select b4 = new Select(type);
		b4.selectByIndex(2);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select b5 = new Select(month);
		b5.selectByIndex(2);
		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select b6 = new Select (year);
		b6.selectByIndex(3);
		
		WebElement ccv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		ccv.sendKeys("9345981276");
		
		WebElement Booking = driver.findElement(By.id("book_now"));
		Booking.click();		
		
		WebElement History = driver.findElement(By.xpath("//input[@type='button']"));
		History.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File des = new File("C:\\Users\\Prasanth\\eclipse-workspace\\SeleniumWorld\\Screenshot\\Booking.png");
    	Files.copy(src, des);
	
		 
		
	}
	

}
