package com.mavenproject.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLoginTitle {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/Login");
	
	String titleofthepage= driver.findElement(By.tagName("h1")).getText();
	System.out.println(titleofthepage);
	Thread.sleep(2000);
	driver.close();
}
}
