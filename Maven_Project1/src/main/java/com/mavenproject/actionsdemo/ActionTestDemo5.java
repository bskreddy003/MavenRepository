package com.mavenproject.actionsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTestDemo5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		WebElement googlesearch= driver.findElement(By.name("q"));
		Actions action= new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys(googlesearch,"Selenium").perform();
		Thread.sleep(3000);
		driver.close();
		
	}

}
