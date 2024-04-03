package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    WebElement sourceEle = driver.findElement(By.id("box6"));
	    WebElement targetEle = driver.findElement(By.id("box106"));
	    Actions action = new Actions(driver);
	    action.dragAndDrop(sourceEle, targetEle).perform();
	}

}
