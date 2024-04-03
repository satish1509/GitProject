package interviewPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class Subtract {
	@Test
	@Parameters({"a","b"})  
	public void add(int c, int d)  
	{  
	int subtract=c-d;  
	System.out.println("Subtraction of two numbers : "+subtract);  
	}  
}
