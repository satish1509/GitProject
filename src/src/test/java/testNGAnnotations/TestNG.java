package testNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
@BeforeMethod
 public void setup() {
	 System.out.println("Launching browser and open application URL");
 }
@AfterMethod
 public void closure() {
	 System.out.println("closing the browser");
 }
 @Test
 public void login() {
	 System.out.println("Executing the Login Test");
 }
 @Test
 
 
 public void register() {
	 System.out.println("Executing the Register Test");
 }
 @Test
 public void home() {
	 System.out.println("Executing the Home Test");
 }
}
