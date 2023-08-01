package com.mavenproject.checkboxradiosession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioAllButtons {
public void radioselect(String reqcar) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.letskodeit.com/practice");
	List<WebElement> allradios= driver.findElements(By.xpath("//label/input[type='radio']"));
	for(WebElement radio:allradios) {
		String cars= radio.getAttribute("type");
		if(cars.equals(reqcar)) {
			radio.click();
			break;
		}
	}
		
}
public static void main(String[] args) {
	RadioAllButtons test= new RadioAllButtons();
	test.radioselect("benz");
	
}
}
