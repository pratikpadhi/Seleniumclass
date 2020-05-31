package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_handeling {

	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html"); 
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		/*
		 * driver.switchTo().frame("classFrame"); //switching the frame by ID
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		 * driver.switchTo().defaultContent(); driver.switchTo().frame(1);
		 * Thread.sleep(3000); driver.findElement(By.linkText("Actions")).click();
		 * driver.switchTo().parentFrame();
		 * driver.switchTo().frame(driver.findElement(By.
		 * xpath("//frame[@title='All Packages']"))); Thread.sleep(3000);
		 * driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		 */
		   
	}

}
