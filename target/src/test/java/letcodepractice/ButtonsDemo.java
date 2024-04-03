package letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsDemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		/*
		//Goto Home and come back here using driver command
		WebElement goToButton = driver.findElement(By.id("home"));
		goToButton.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		//Get the X & Y co-ordinates
		WebElement findLocation = driver.findElement(By.id("position"));
		Point point = findLocation.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
       
		//Find the color of the button
		WebElement getColour = driver.findElement(By.id("color"));
        String buttonColour = getColour.getCssValue("background-color");
		System.out.println(buttonColour);
		
		//Find the height & width of the button
		WebElement heightwidthButton = driver.findElement(By.id("property"));
	    Dimension size = heightwidthButton.getSize();
		System.out.println(size.height);
		System.out.println(size.width);
		
		//Confirm button is disabled
		WebElement disabledButton = driver.findElement(By.id("isDisabled"));
		 boolean button = disabledButton.isEnabled();
		System.out.println(button);
		*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(5000);
		/*
		//Click and Hold Button
		Actions action = new Actions(driver);
		WebElement clickAndHold = driver.findElement(By.xpath("//button[@class=\"button is-primary\"][@id=\"isDisabled\"]"));
		action.clickAndHold(clickAndHold).perform();
		Thread.sleep(5000);
		action.release().perform();
	*/
		driver.quit();
	}

}
