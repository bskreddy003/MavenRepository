package com.mavenproject.alertsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsTest1 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.letskodeit.com/practice");
	driver.findElement(By.name("enter-name")).sendKeys("TestingDemo");
	Thread.sleep(2000);
	//driver.findElement(By.id("alertbtn")).click();
	driver.findElement(By.id("confirmbtn")).click();
	Alert alert= driver.switchTo().alert();
	String message= alert.getText();
	System.out.println(message);
	Thread.sleep(3000);
	//alert.accept();
	alert.dismiss();
	Thread.sleep(3000);
	driver.close();
	
	}
}
