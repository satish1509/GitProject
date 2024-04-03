package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMParameters {
WebDriver driver;
@BeforeTest
public void InitialiseBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}/*
@AfterTest
public void Teardown() {
	driver.quit();
}*/
@Test
public void LaunchApp() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@Test
public void EnterLoginDetails() throws InterruptedException {
	Thread.sleep(5000);
	WebElement login = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	login.sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
	//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	//Thread.sleep(5000);
}
}
