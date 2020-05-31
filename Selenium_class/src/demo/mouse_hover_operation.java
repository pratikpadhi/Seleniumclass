package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover_operation {

	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Open Google
		//driver.get("http://www.google.com");
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Forgot?']/ancestor::div/button")).click();
		
		Thread.sleep(3000);
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		String parentwindow=itr.next();
		String childwindow=itr.next();
		driver.switchTo().window(childwindow);
		driver.navigate().to("http://newtours.demoaut.com/");
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		set=driver.getWindowHandles();
		itr=set.iterator();
		itr.next();
		itr.next();
		String thirdtab=itr.next();
		driver.switchTo().window(thirdtab);
		System.out.println(parentwindow);
		System.out.println(childwindow);
		System.out.println(thirdtab);
		driver.navigate().to("https://www.makemytrip.com/");
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		//WebElement wb=driver.findElement(By.xpath("//span[text()='Electronics']"));
		/*
		 * WebElement wb=driver.findElement(By.
		 * xpath("//input[@placeholder='Search for products, brands and more']"));
		 * Actions act=new Actions(driver); wb.sendKeys("lenovo");
		 * //act.moveToElement(wb).build().perform(); //
		 * act.sendKeys(Keys.ENTER).build().perform();
		 * act.sendKeys(Keys.chord(Keys.CONTROL,"a")).build().perform();
		 */
		
	}

}
