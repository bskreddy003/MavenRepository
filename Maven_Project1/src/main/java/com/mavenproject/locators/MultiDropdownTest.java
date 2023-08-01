package com.mavenproject.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropdownTest {
	//selectByIndex
	//selectByValue
	//selectByVisibleText
	//deselectByIndex
	//deselectByValue
	//deselectByVisibleText
	//deselectAll
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		WebElement multidropdown= driver.findElement(By.id("multiple-select-example"));
		Select ref= new Select(multidropdown);
		ref.selectByIndex(0);
		ref.selectByValue("Orange");
		ref.selectByVisibleText("Peach");
		List<WebElement> selectedoptions= ref.getAllSelectedOptions();
		System.out.println("Selected values from multidropdownlist");
		for(WebElement option:selectedoptions) {
			System.out.println(option);
			Thread.sleep(3000);
			driver.close();
			
		}
		
		
	}
}
