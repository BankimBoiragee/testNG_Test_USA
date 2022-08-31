package testngtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnotation_Test {
@Test	
public void testCase() {
System.out.println("This is a normal Test Case");	
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("This will execute before every method");
}
@AfterMethod
public void afterMethod() {
	System.out.println("This will execute after every method");
}
@BeforeClass
public void beforeClass() {
	System.out.println("This will execute before class");
}
@AfterClass
public void afterClass() {
	System.out.println("This will execute after class");
}
@BeforeTest
public void beforeTest() {
	System.out.println("This will execute before test");
}
@AfterTest
public void afterTest() {
	System.out.println("This will execute after test");
}
@BeforeSuite
public void beforeSuite() {
	System.out.println("This will execute before suit");
}
@AfterSuite
public void afterSuite() {
	System.out.println("This will execute after suite");
}
}
