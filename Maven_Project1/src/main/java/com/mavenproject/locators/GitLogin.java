package com.mavenproject.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		WebElement usrname= driver.findElement(By.id("login_field"));
		usrname.sendKeys("Testing123@gmail.com");
		Thread.sleep(3000);//halt the execution time for 3 mins
		usrname.clear();
		usrname.sendKeys("Testing143@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@1234");
		driver.findElement(By.name("commit")).click();
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);
		String pageurl= driver.getCurrentUrl();
		System.out.println(pageurl);
		driver.close();
		
		
		

		
		
	}

}
