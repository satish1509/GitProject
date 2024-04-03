package interviewPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    //GetWindowHandle
	   String WindowId = driver.getWindowHandle();
	   System.out.println(WindowId);
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	   
	  //GetWindowHandles
	   Set<String> windowIds = driver.getWindowHandles();
	   System.out.println(windowIds);
	   
	   //capture window ids by using iterator
	   Iterator<String> ids = windowIds.iterator();
	   String parent = ids.next();
	   String child = ids.next();
	   System.out.println("Iterator concept parent is :"+parent);
	   System.out.println("Iterator concept child is :"+child);
	   
	   //capture ids by using List/ArrayList
	   List<String> windowId = new ArrayList(windowIds);//convert set to List
	   String parentid = windowId.get(0);
	   String childid = windowId.get(1);
	   System.out.println("ArrayList concept parent is :"+parentid);
	   System.out.println("ArrayList concept child is :"+childid);
	   
	   //How to use ids for switching
	   String parentWindowTitle = driver.switchTo().window(parentid).getTitle();
	   String childWindowTitle = driver.switchTo().window(childid).getTitle();
	   System.out.println("parent window title is :"+parentWindowTitle);
	   System.out.println("child window title is :"+childWindowTitle);
	   
	   //By using ForEachLoop
	   for(String Winid : windowIds) {
		   String title = driver.switchTo().window(Winid).getTitle();
		   System.out.println("switch using foreach loop :"+title);
	   }
	   
	   //driver.close()-Close the window in which driver is pointing
	   //driver.quit() - close all windows 
	   for(String Winid:windowIds) {
	    	 String title = driver.switchTo().window(Winid).getTitle();
	    	 System.out.println(title);
	    	 driver.quit();
	     }
	}

}
