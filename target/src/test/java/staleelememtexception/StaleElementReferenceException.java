package staleelememtexception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.pavantestingtools.com/");
	 WebElement link = driver.findElement(By.xpath("//a[text()='Online Training']"));
	 link.click();
	 driver.navigate().back();
	 Thread.sleep(5000);
	 
	 link.click();

 }
}
