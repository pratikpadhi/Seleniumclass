package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Pratik%20Padhi/Desktop/demo.html");
		Select sel=new Select(driver.findElement(By.name("abc")));
		sel.selectByIndex(1);
		sel.selectByValue("c");
		sel.selectByVisibleText("Mumbai");
		Select sel1=new Select(driver.findElement(By.name("xyz")));
		sel1.selectByIndex(2);
		sel1.selectByValue("e");
		sel1.selectByVisibleText("Chhenai");
		List<WebElement> lst=sel1.getOptions();
		for(WebElement wb:lst)
			System.out.println(wb.getText());
		System.out.println(sel1.isMultiple());
		List<WebElement> lst1=sel1.getAllSelectedOptions();
		for(WebElement wb:lst1) {
			System.out.println(wb.getText());
		}
		System.out.println(sel1.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		  sel1.deselectByValue("f"); Thread.sleep(2000); sel1.deselectByIndex(1);
		  Thread.sleep(2000); sel1.deselectByVisibleText("Chhenai");
		  Point point=driver.findElement(By.name("abc")).getLocation();
		  System.out.println(point);
		  System.out.println(point.getX());
		  System.out.println(point.getY());
		 
		//sel1.deselectAll();
	}

}
