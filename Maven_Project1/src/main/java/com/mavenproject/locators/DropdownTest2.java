package com.mavenproject.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		WebElement cars= driver.findElement(By.id("carselect"));
		Select carlist= new Select(cars);
		List<WebElement> dropdownvalues= carlist.getOptions();
		for(WebElement element:dropdownvalues) {
			String data= element.getText();
			System.out.println(data);
		}
		
		
	}

}
