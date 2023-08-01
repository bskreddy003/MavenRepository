package com.mavenproject.actionsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTestDemo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		WebElement googlesearchbtn= driver.findElement(By.xpath("//input[@value='Google Search'][1]"));
		Actions action= new Actions(driver);
		action.moveToElement(googlesearchbtn).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
