package letcodepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// Select the apple using visible text
		WebDriver driver = new ChromeDriver();
	   	driver.manage().window().maximize();
	   	driver.get("https://letcode.in/dropdowns");
	   	WebElement fruitsDropDown = driver.findElement(By.id("fruits"));
	   	Select select = new Select(fruitsDropDown);
	   	select.selectByVisibleText("Apple");
	   	//Select your super hero's
	   	WebElement superHerosDropDown = driver.findElement(By.id("superheros"));
	   	Select select1 = new Select(superHerosDropDown);
	   	if(select1.isMultiple()) {
	   		select1.selectByVisibleText("Ant-Man");
	   		select1.selectByVisibleText("Batman");
	   		select1.selectByVisibleText("Batwoman");
	   	}
	   	//Select the last programming language and print all the options
	   	WebElement languagesField = driver.findElement(By.id("lang"));
	   	Select select2 = new Select(languagesField);
	   	List<WebElement> options = select2.getOptions();
	   	int noOfOptions = options.size();
	   	int lastOption = noOfOptions-1;
	   	select2.selectByIndex(lastOption);
	   	for(WebElement option : options) {
	   		System.out.println(option.getText());
	   	}
	   	
	   	//Select India using value & print the selected value
	   	WebElement countryList = driver.findElement(By.id("country"));
	   	select = new Select(countryList);
	   	select.selectByVisibleText("India");
	   	System.out.println(select.getFirstSelectedOption().getText());
	}

}
