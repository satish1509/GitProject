package interviewPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
    
   //Alert window with ok button
    driver.findElement(By.xpath("//input[@onclick='show_alert()']")).click();
    Thread.sleep(5000);
    driver.switchTo().alert().accept();
    
    //Alert window with ok & close button
    driver.findElement(By.xpath("//input[@onclick=\"show_confirm()\"]")).click();
    Thread.sleep(5000);
    driver.switchTo().alert().accept();//close alert by using ok button
    //driver.switchTo().alert().dismiss();//close alert by using alert button
   
    //Alert window with input box, capture text from alert
    driver.findElement(By.xpath("//input[@onclick=\"show_prompt()\"]")).click();
     Alert alertWindow = driver.switchTo().alert();
     System.out.println(alertWindow.getText());
     alertWindow.sendKeys("Welcome");
     Thread.sleep(3000);
     alertWindow.accept();
     
}
}
