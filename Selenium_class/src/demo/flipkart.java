package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;



public class flipkart {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub


System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "./chromeLogs.txt");
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.flipkart.com");

driver.findElement(By.cssSelector("[class='_2zrpKA _1dBPDZ']")).sendKeys("subhankarsahoo94@gmail.com");
driver.findElement(By.xpath("//*[contains(@class,'_2zrpKA _3v41xv')]")).sendKeys("subhankar.94");
driver.findElement(By.cssSelector("[class='_2AkmmA _1LctnI _7UHT_c']")).click();
Thread.sleep(4000);
driver.findElement(By.cssSelector("[class='_3ko_Ud']")).click();
Thread.sleep(5000);

 

List<WebElement> cartItems = driver.findElements(By.xpath("//div[contains(text(),'My Cart')]/ancestor::div[4]/div//a[@class='_325-ji _3ROAwx']"));
List<WebElement> remove = driver.findElements(By.xpath("//div[contains(text(),'My Cart')]/ancestor::div[4]/div//div[text()='Remove']"));
System.out.println(cartItems.size());
System.out.println(remove.size());

JavascriptExecutor js = (JavascriptExecutor)driver;
while(cartItems.size()>1) {
for(int i=0;i<cartItems.size();i++)
{
if(driver.findElement(By.xpath("//div[contains(text(),'My Cart')]/ancestor::div[4]/div["+ (i+2)+"]//a[@class='_325-ji _3ROAwx']")).getText().contains("Apple iPhone 11")) {
System.out.println(driver.findElement(By.xpath("//div[contains(text(),'My Cart')]/ancestor::div[4]/div["+ (i+2)+"]//a[@class='_325-ji _3ROAwx']")).getText());
}else {
try {
Thread.sleep(1000);
js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[contains(text(),'My Cart')]/ancestor::div[4]/div["+(i+2)+"]//div[text()='Remove']")) );
Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='Remove Item']/following-sibling::div/div/div[2]")).click();
break;
}catch(StaleElementReferenceException ex){
Thread.sleep(1000);

js.executeScript("argumets[0].click();", driver.findElement(By.xpath("//div[contains(text(),'My Cart')]/ancestor::div[4]/div["+(i+2)+"]//div[text()='Remove']")) );

}


}

}
Thread.sleep(5000);
cartItems = driver.findElements(By.xpath("//div[contains(text(),'My Cart')]/ancestor::div[4]/div//a[@class='_325-ji _3ROAwx']"));
System.out.println(cartItems.size());
}
}

}
