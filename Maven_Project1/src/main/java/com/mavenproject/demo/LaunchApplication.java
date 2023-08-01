package com.mavenproject.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
//		driver.get("https://google.com");
	driver.get("https://facebook.com");
	driver.manage().window().maximize();
	driver.close();
	}

}
