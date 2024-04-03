package hrm_orange;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_HRM {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
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
	      WebElement Registrationbu = driver.findElement(By.linkText("Recruitment"));
	      Registrationbu.click();
	      WebElement jobTitle = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active']/descendant::div/descendant::i)[1]"));
	      jobTitle.click();
	      driver.findElement(By.xpath("//span[text()='Chief Technical Officer']")).click();
	      WebElement vacancy = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[2]"));
	      vacancy.click();
	      driver.findElement(By.xpath("//span[text()='Sales Representative']")).click();
	      WebElement hiringManager = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[3]"));
	      hiringManager.click();
	      driver.findElement(By.xpath("//span[text()='Rahul Patil']")).click();
	      WebElement status = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[4]"));
	      status.click();
	      driver.findElement(By.xpath("//span[text()='Shortlisted']")).click();
	      WebElement fromDate = driver.findElement(By.xpath("(//div[@class=\"oxd-date-input\"])[1]"));
	      fromDate.click();
	      WebElement month = driver.findElement(By.xpath("//div[@class=\"oxd-calendar-selector-month-selected\"]"));
	      month.click();
	      driver.findElement(By.xpath("//li[text()='March']")).click();
	      WebElement year = driver.findElement(By.xpath("//div[@class=\"oxd-calendar-selector-year-selected\"]"));
	      year.click();
	      driver.findElement(By.xpath("//li[text()='2024']")).click();
	      WebElement date = driver.findElement(By.xpath("(//div[@class=\"oxd-calendar-date\"])[1]"));
	      date.click();
	      WebElement toDOA = driver.findElement(By.xpath("(//div[@class=\"oxd-date-input\"])[2]"));
	      toDOA.click();
	      WebElement toMonth = driver.findElement(By.xpath("//div[@class=\"oxd-calendar-selector-month-selected\"]"));
	      toMonth.click();
	      driver.findElement(By.xpath("//li[text()='March']")).click();
	      WebElement toYear = driver.findElement(By.xpath("//div[@class=\"oxd-calendar-selector-year-selected\"]"));
	      toYear.click();
	      driver.findElement(By.xpath("//li[text()='2024']")).click();
	      driver.findElement(By.xpath("(//div[@class=\"oxd-calendar-date\"])[25]")).click();
	}     
	}

