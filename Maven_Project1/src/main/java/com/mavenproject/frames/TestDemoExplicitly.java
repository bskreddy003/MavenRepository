package com.mavenproject.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemoExplicitly {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.get("https://letcode.in/waits");
	WebDriverWait wait= new WebDriverWait(driver, 30);
	driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
	Alert alert= wait.until(ExpectedConditions.alertIsPresent());
	System.out.println(driver.getTitle());
	alert.accept();
	
	
	
	
}
}
