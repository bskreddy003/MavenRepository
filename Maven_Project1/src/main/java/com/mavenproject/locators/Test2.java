package com.mavenproject.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		WebElement dropdown= driver.findElement(By.id("dropdown"));
		Select ref1= new Select(dropdown);
		ref1.selectByIndex(2);
		ref1.selectByVisibleText("Option 1");		
		ref1.selectByValue("2");
		WebElement Optionselected= ref1.getFirstSelectedOption();
		System.out.println(Optionselected.getText());
	}

}
