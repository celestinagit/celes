package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samplee {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver(); 
    
	driver.get("https://www.facebook.com/"); //to get the webpage
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("r@gmail.com"); //syn://tagname[@attname='attvalue']
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
}
}
