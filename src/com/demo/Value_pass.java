package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Value_pass {
	
	public static void main(String[] agrs)  {
		 
		  System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\god\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		  
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.saucedemo.com/v1/index.html");
		  driver.manage().window().maximize();
		  
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();		  
		  
	}

}
