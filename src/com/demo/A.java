package com.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[]agrs) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\god\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		  
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.automationtesting.in/Alerts.html");
	 driver.manage().window().maximize();
	WebElement alert= driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	alert.click();
	WebElement click=driver.findElement(By.xpath("//button[contains(text(),'demonstrate the prompt box ')]"));
	click.click();
    Alert a=driver.switchTo().alert();
    a.sendKeys("Alltrin");
    Thread.sleep(3000);
    a.getText();
    Thread.sleep(3000);
    a.accept();
    
    
	
	

	
	}}
