package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BcExtends extends BaseCls {
	
public static void main(String[] args) {
	launchChrome();
	loadUrl("https://www.facebook.com/");
	winMax();
	printTitle();
	printCurrentUrl();
	WebElement usr=driver.findElement(By.id("email"));
    fill(usr,"red");
    WebElement psd=driver.findElement(By.id("pass"));
    fill(psd,"black");
    WebElement btn=driver.findElement(By.xpath("//button[@name='login']"));
    btnClick(btn);
    
    
    




}
}
