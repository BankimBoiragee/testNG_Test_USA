package testngtest;

import org.testng.annotations.Test;

public class InvocationCount {

@Test(invocationCount=10)	
public void getCount() {
		System.out.println("Test");
	}
}
