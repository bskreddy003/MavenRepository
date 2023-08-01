package com.mavenproject.actionsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.letskodeit.com/practice");
		WebElement mousebtn= driver.findElement(By.id("mousehover"));
		Actions action= new Actions(driver);
		action.moveToElement(mousebtn).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[Text()='Top']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
