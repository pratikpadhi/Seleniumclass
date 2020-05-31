package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Open Google
		//driver.get("http://www.google.com");
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(2000);
		//driver.findElement(By.name("password")).clear();
		
		String s=driver.findElement(By.xpath("//input[@type='password']/parent::td/preceding-sibling::td/font")).getText();
	System.out.println(s);
	System.out.println(driver.findElement(By.name("password")).isDisplayed());
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//input[@value='roundtrip']")).getAttribute("name"));
	System.out.println(driver.findElement(By.xpath("//input[@value='roundtrip']")).getCssValue("color"));
	System.out.println(driver.findElement(By.xpath("//input[@value='roundtrip']")).getTagName());
	System.out.println(driver.findElement(By.xpath("//input[@value='roundtrip']")).isEnabled());
	System.out.println(driver.findElement(By.xpath("//input[@value='roundtrip']")).isSelected());
	driver.close();
	}

}
