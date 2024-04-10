package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {
	
	
	
	public static void main(String[] agrs)  {
		 
		  System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\god\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		  
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.instagram.com/");
		  
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.facebook.com/");
		  driver.navigate().back();
		  driver.navigate().to("https://www.youtube.com/");
		  driver.navigate().forward();
		  driver.navigate().to("https://www.flipkart.com/");
		  driver.navigate().refresh();
		  driver.close();
}}
