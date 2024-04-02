package interviewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
@Test
public void testGoogle() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    System.out.println(driver.getTitle());
    String expectedTitle = "OrangeHRMM";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle,"Title is mismatched");
    driver.quit();
}

}
