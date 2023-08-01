package com.mavenproject.JavaScriptDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo2 {

public static void main(String[] args) throws IOException {
	File fi= new File("D:\\LKQCORP123\\Maven_Project1//TestData.Properties");
	BufferedReader br= new BufferedReader(new FileReader(fi));
	Properties pr= new Properties();
	pr.load(br);
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	String urlofApp= pr.getProperty("url");
	driver.get(urlofApp);
	String usrname= pr.getProperty("username");
	String password= pr.getProperty("password");
	driver.findElement(By.id("email")).sendKeys(usrname);
	driver.findElement(By.id("login-password")).sendKeys(password);
	driver.findElement(By.id("login")).click();
	
	
	
	
}
}
