package interviewPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    // WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //getWindowHandle()
	    String windowID = driver.getWindowHandle();//Return Id of the single browser window
	    System.out.println(windowID);//F6F7422126BA97DE6A992ACA05DC688A
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	    //getWindowHandles()
	    Set<String> windowIds = driver.getWindowHandles();//Resturn Set<String>
	    /*System.out.println(windowIds);
	    //capture windows ids by using iterator 
	    Iterator<String> ids = windowIds.iterator();
	    String parentID = ids.next();
	    String childID = ids.next();
	    System.out.println("Parent ID is :"+parentID);
	    System.out.println("Child ID is :"+childID);*/
	    
	    //capture windows ids using List/ArrayList
	    //set:Duplicates are not allowed 
	    //List: Duplicates are allowed
	     List<String> windowIDs = new ArrayList(windowIds);//convert set to list
	     String ParentId = windowIDs.get(0);
	     String ChildId = windowIDs.get(1);
	     System.out.println("Parent ID is :"+ParentId);
		 System.out.println("Child ID is :"+ChildId);
		 //How to use Ids for switching
		 String childTitle = driver.switchTo().window(ChildId).getTitle();
		 System.out.println("child window title :"+childTitle);
		 String parentTitle = driver.switchTo().window(ParentId).getTitle();
		 System.out.println("parent window title :"+parentTitle);
		 
	     //By using for each loop
	     /*for(String Winid:windowIDs) {
	    	 String title = driver.switchTo().window(Winid).getTitle();
	    	 System.out.println(title);
	     }
	     driver.close();//close window in which driver is pointing on
	     driver.quit();//close all windows
	     for(String Winid:windowIDs) {
	    	 String title = driver.switchTo().window(Winid).getTitle();
	    	 System.out.println(title);
	    	 if(title.equals("Human Resources Management Software | OrangeHRM")) {
	    		 driver.close(); 
	    	 }
	     }*/
	     
	}

}
