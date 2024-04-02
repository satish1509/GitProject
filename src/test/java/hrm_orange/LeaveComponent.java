package hrm_orange;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaveComponent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	     userName.sendKeys("Admin");
	     WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	     password.sendKeys("admin123");
	     // Thread.sleep(5000);
	     WebElement Login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	     Login.click();
	     driver.findElement(By.xpath("//span[text()='Leave']")).click();
	     /*
	     driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[1]")).click();
	      //driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[1]")).sendKeys("2024-03-03");
	     driver.findElement(By.xpath("//div[@class=\"oxd-calendar-selector-month-selected\"]")).click();
	     driver.findElement(By.xpath("//li[text()='March']")).click();
	     driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/p[@class='oxd-text oxd-text--p']")).click();
	     driver.findElement(By.xpath("//li[text()='2024']")).click();
	    
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("(//div[@class=\"oxd-calendar-date\"])[19]")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[2]")).click();
	     driver.findElement(By.xpath("//div[@class=\"oxd-calendar-selector-month-selected\"]")).click();
	     driver.findElement(By.xpath("//li[text()='April']")).click();
	     driver.findElement(By.xpath("//div[@class=\"oxd-calendar-selector-year-selected\"]")).click();
	     driver.findElement(By.xpath("//li[text()='2024']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("(//div[@class=\"oxd-calendar-date\"])[1]")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[text()='Select']")).click();
	     driver.findElement(By.xpath("//span[text()='Cancelled']")).click();
	     */
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("(//div[@class=\"oxd-select-wrapper\"])[1]")).click();
	     Thread.sleep(5000);
         driver.findElement(By.xpath("//span[text()='CAN - Personal']")).click();
         driver.findElement(By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]")).click();
	}

}
