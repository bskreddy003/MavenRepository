package com.mavenproject.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrameDemo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://letcode.in/frame");
		WebElement frame1= driver.findElement(By.xpath("//*[@name='firstFr']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("fname")).sendKeys("Sreekanth");
		driver.findElement(By.name("lname")).sendKeys("Bhumireddy");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='innerFrame']")));
		driver.findElement(By.name("email")).sendKeys("bskreddy003@gmail.com");
		driver.switchTo().defaultContent();
		driver.findElement(By.name("lname")).sendKeys("Reddy");
		Thread.sleep(3000);
		//driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
		
		
	}

}
