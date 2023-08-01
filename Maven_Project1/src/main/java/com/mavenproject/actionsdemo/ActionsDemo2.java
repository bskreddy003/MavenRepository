package com.mavenproject.actionsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo2 {
	
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement rightclickbutton= driver.findElement(By.xpath("//span[text()='right click me']"));
Actions action= new Actions(driver);
action.contextClick(rightclickbutton).perform();
WebElement deletebutton= driver.findElement(By.xpath("//span[.='Delete']"));
action.click(deletebutton);
Alert alert= driver.switchTo().alert();
String alertmessage= alert.getText();
System.out.println(alertmessage);
alert.accept();
Thread.sleep(4000);
driver.close();




}
	
	
}
