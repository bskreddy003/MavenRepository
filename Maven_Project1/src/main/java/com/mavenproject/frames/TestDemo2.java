package com.mavenproject.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[text()='Textbox1']/../../h3/input")).sendKeys("Testing");
		Thread.sleep(3000);
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.xpath("//b[text()='Textbox2']/../../h3/input[2]")).sendKeys("Bhumireddy");
		
		
		
		
	}

}
