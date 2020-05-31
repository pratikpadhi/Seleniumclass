package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

	
		Actions action = new Actions(driver);

	//	WebElement link = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement link = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//action.contextClick(link).perform();
		action.doubleClick(link).build().perform();
	Thread.sleep(2000);
		
		//driver.close();
	}

}
