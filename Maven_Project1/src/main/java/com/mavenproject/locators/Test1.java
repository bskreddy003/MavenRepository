package com.mavenproject.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/dropdown");
	WebElement dropdown= driver.findElement(By.id("dropdown"));
	Select ref= new Select(dropdown);
	ref.selectByIndex(2);//parameter is integer
	ref.selectByValue("2");//Parameter is String
	ref.selectByVisibleText("Option 1"); // parameter is String
}
}
