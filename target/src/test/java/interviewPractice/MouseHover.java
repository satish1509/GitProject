package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.opencart.com/");
	    WebElement parentElement = driver.findElement(By.xpath("//a[text()='Desktops']"));
	    WebElement childElement = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	    Actions action = new Actions(driver);
	    Thread.sleep(5000);
	    action.moveToElement(parentElement).moveToElement(childElement).click().perform();
	}

}
