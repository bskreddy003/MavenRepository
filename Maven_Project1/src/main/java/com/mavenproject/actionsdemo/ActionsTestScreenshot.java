package com.mavenproject.actionsdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTestScreenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
	WebElement googlesearch= driver.findElement(By.name("q"));
	Actions action= new Actions(driver);
	action.keyDown(Keys.SHIFT).sendKeys(googlesearch,"Selenium").keyUp(Keys.SHIFT).sendKeys("Selenium").perform();
	File filename= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(filename, new File ("D:\\reddy\\page.jpg"));
	Thread.sleep(3000);
	driver.close();
	
}
}
