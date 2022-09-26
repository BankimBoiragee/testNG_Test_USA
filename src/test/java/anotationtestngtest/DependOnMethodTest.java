package anotationtestngtest;

import org.testng.annotations.Test;

public class DependOnMethodTest {
@Test	
public void getEmployees() {
	System.out.println("Employees are working");
}
@Test(dependsOnMethods= {"getEmployees"})
public void getSalary() {
	System.out.println("Employees are working and getting salary");
}
@Test(dependsOnMethods= {"getSalary"})
public void payTax() {
	System.out.println("Pay tax because of getting salary");
}

}
