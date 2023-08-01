package com.mavenproject.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropdowndeselect {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		WebElement multidropdownlist1= driver.findElement(By.id("multiple-select-example"));
		Select ref1= new Select(multidropdownlist1);
		ref1.selectByIndex(0);
		ref1.selectByValue("Orange");
		ref1.selectByVisibleText("Peach");
		Thread.sleep(3000);
		ref1.deselectAll();//deselect all options at a time
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
