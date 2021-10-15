package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCls {

	public static WebDriver driver;  //initializing the variable name for webdriver
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Select s;
	public static WebDriverWait w;
	public static Alert ale;
	public static File f;
	public static FileInputStream fin;
	
	//1
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	//2
	public static void loadUrl(String url) {
		driver.get(url);

	}
	//3
	public static void winMax() {
		driver.manage().window().maximize();

	}
	//4
	public static void printTitle() {
	System.out.println(driver.getTitle());

	}
	//5
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());

	}
	//6
	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);

	}
	//7
	public static void btnClick(WebElement ele) { //webelement var name cn be same bcz it ends within the method{}
		ele.click();

	}
	//8
	public static void refre() {
		
    driver.navigate().refresh();
	}
	
	//9
	public static void clos() {
		
    driver.close();
	}
	//10
	public static void quitt() {
		
   driver.quit();
	}
	
	//11 
	public static void gtTxt(WebElement txt) {
		txt.getText();
		
	}
	
	//12
	public static void getAtt(WebElement att,String value) {
		att.getAttribute(value);
	}
	//13 actions
	public static void dragDrop(WebElement src,WebElement desc) {
		a=new Actions(driver);
		a.dragAndDrop(src, desc).perform();
		
	}
	//14
	 public static void doubClick(WebElement ele) {
		 a=new Actions(driver);
		 a.doubleClick(ele).perform();
	 }
	//15
	public static void rgtClick(WebElement ref) {
		a=new Actions(driver);
		a.contextClick(ref).perform();
	}
	//16
	 public static void movtOEle(WebElement ele) {
		 a=new Actions(driver);
		 a.moveToElement(ele).perform();
	 }
	
	//17 robot
	 public static void pressEnter() throws AWTException {
		 r=new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
	 }
	 //18
	 public static void pressDown() throws AWTException {
		 r=new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
	 }
	 //19
	 public static void pressUp() throws AWTException {
		 r=new Robot();
		 r.keyPress(KeyEvent.VK_UP);
		 r.keyRelease(KeyEvent.VK_UP);
	 }
	 //20
	 public static void selectAll() throws AWTException {
		 r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_A);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_A);
	 }
	 //21
	 public static void cut() throws AWTException {
		 r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_X);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_X);
	 }
	 //22
	 public static void copy() throws AWTException {
		 r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_C);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_C);
	 }
	 //23
	 public static void paste() throws AWTException {
		 r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
	 }
	 //24
	 public static void pressTab() throws AWTException {
		 r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_TAB);
	 }
	 
	 //25 javaexecutor
	 public static void setAttri(WebElement ele,String val) {
	 js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].setAttribute('value','val')",ele);
	 }
	 
	 //26
	 public static void jsClick(WebElement ele) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0]..click()",ele);
		 }
	 
	 //27
	 public static void jsScrollUp(WebElement ele) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(false)",ele);

	}
	 
	 //28
	 public static void jsScrollDown(WebElement ele) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)",ele);

	}
	 
	 //29 screenshot
	 public static void scrshot(String desc) throws IOException {
		 ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File d=new File(desc);
		 FileUtils.copyFile(src, d);
	 }
	 
	//30 frame
	 public static void frameId(String id) {
		 driver.switchTo().frame(id);
		 
	 }
	 
	 //31
	 public static void frameIndx(int index) {
		 driver.switchTo().frame(index);
		 
	 }
	 
	 //32
	 public static void frameWebElement(WebElement e) {
		 driver.switchTo().frame(e);
		 
	 }
	 //33
	 public static void frameName(String name) {
		 driver.switchTo().frame(name);
		 }
	//34
	 public static void defCon() {
		 driver.switchTo().defaultContent();
	 }
	 //35
	 public static void pFrame() {
	 driver.switchTo().parentFrame();
	 }
	 
	//36 DropDown
		public static void selectIndex(WebElement ele,int ind) {
		    s = new Select(ele);
		    s.selectByIndex(ind);		
		}
	//37
	public static void selectVisibleText(WebElement ele,String txt) {
			  s = new Select(ele);
			  s.selectByVisibleText(txt);	
		}
	//38
	public static void selectValue(WebElement ele,String val) {
			 s = new Select(ele);
			 s.selectByValue(val);		
		}
	//39
	public static void selectMultiple(WebElement ele) {
			 s = new Select(ele);
			 s.isMultiple();	
		}
	//40
	public static void getOption(WebElement ele) {
		   s = new Select(ele);
		   s.getOptions();		
		}
	//41
	public static void allSelecOption(WebElement ele) {
		   s = new Select(ele);
		   s.getAllSelectedOptions();		
		}
	//42
	public static void firstSelOption(WebElement ele) {
		   s = new Select(ele);
		   s.getFirstSelectedOption();	
		}
	//43
	public static void deSelectIndex(WebElement ele,int ind) {
		    s = new Select(ele);
		    s.deselectByIndex(ind);		
		}
	//44
	public static void deSelectVisibleText(WebElement ele,String txt) {
		   s = new Select(ele);
		   s.deselectByVisibleText(txt);
		}
	//45
	public static void deSelectValue(WebElement ele,String val) {
	      s = new Select(ele);
		  s.deselectByValue(val);		
		}
	//46
	public static void deSelAll(WebElement ele) {
		  s = new Select(ele);
		  s.deselectAll();		
		}
	//47 Windows Handling
	public static void windowUrl(String url) {
		driver.switchTo().window(url); 	  		
		}
	//48
	public static void windowTitle(String title) {
		driver.switchTo().window(title); 		
		}
	//49
	public static void windowId (String id) {
		driver.switchTo().window(id);
		}
	//50
	public static void windowHdle() {
		driver.getWindowHandle();
		}
	//51
	public static void windowHdles() {
		driver.getWindowHandles();
		}
	//52
	public static void thWaits() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	//53
	public static void impWaits(int num) {
	 driver.manage().timeouts().implicitlyWait(num,TimeUnit.SECONDS);	
		}
	
	//54
	public static void exWaitsClick(int s,String id) {
		w=new WebDriverWait(driver,s);
		w.until(ExpectedConditions.elementToBeSelected(By.id(id)));
		
	}
	//55
	public static void alerAccept() {   
		
		  driver.switchTo().alert();
		  ale.accept();
		}
	
	//56
	public static void alerDismiss() {   
		   driver.switchTo().alert();
		   ale.dismiss();
		}
	//57
	public static void alergetText() {   
		   driver.switchTo().alert();
		   ale.getText();
		}
	//58
	public static void alerSendkeys(String ele) {   
		   driver.switchTo().alert();
		   ale.sendKeys(ele);
		}
	//59
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
