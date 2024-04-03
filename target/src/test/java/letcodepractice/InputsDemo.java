package letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://183.82.103.248:8086/facult");
   WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
   username.sendKeys("mocks");
    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
    password.sendKeys("mocks@123");
    WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
    submit.click();
    WebElement Facultylink = driver.findElement(By.xpath("//span[text()='Faculty']"));
    Facultylink.click();
    WebElement course = driver.findElement(By.xpath("(//div[text()='Select your Specialization'])[2]"));
    course.click();
   /*
   //Enter your name
   driver.findElement(By.id("fullName")).sendKeys("Satish");
   
   //Append a text and press keyboard tab
   driver.findElement(By.id("join")).sendKeys(" teacher.");
   driver.findElement(By.id("join")).sendKeys(Keys.TAB);
   
   //What is inside the textbox
   String retrievedText = driver.findElement(By.id("getMe")).getAttribute("value");
   System.out.println(retrievedText);
   
   //clear text
   driver.findElement(By.id("clearMe")).clear();
   
   //conform edit field is disabled
   boolean enabledStatus = driver.findElement(By.id("noEdit")).isEnabled();
   if(enabledStatus) {
	   System.out.println("Edit field is enabled mode");
   }
   else {
	   System.out.println("Edit field is disabled mode");
   }
   
   //Text is readonly
   String textReadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
   if(textReadonly.equals("true")) {
	   System.out.println("confirm text is in readonly mode");
   }
   else {
	   System.out.println("confirm text is not readonly mode");
   }*/
	}

}
