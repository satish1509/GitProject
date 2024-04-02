package interviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	    WebElement animals = driver.findElement(By.id("animals"));
	    Select animalDropDown = new Select(animals);
	    animalDropDown.selectByVisibleText("Avatar");
	    //animalDropDown.selectByIndex(3);
	    /*List<WebElement> allOptions = animalDropDown.getOptions();
	    for(WebElement option : allOptions) {
	    	if(option.getText().equals("Avatar")) {
	    		option.click();
	    	}
	    }*/
	  
	}

}
