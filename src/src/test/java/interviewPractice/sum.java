package interviewPractice;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class sum {
	@Test  
	@Parameters({"a","b"})  
	public void add(int c, int d)  
	{  
	int sum=c+d;  
	System.out.println("Sum of two numbers : "+sum);  
	}  
}
