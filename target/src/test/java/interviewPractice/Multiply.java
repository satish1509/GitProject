package interviewPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class Multiply {
	@Test
	@Parameters({"a","b"})  
	public void add(int c, int d)  
	{  
	int mul=c*d;  
	System.out.println("Multiplication of two numbers : "+mul);  
	}  
}
