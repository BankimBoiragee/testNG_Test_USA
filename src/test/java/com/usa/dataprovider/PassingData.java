package com.usa.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PassingData {
	private static WebDriver driver;
	
	@DataProvider(name="testData")         //Advance anotation
	public static Object[][] credentials(){    //Create an Object multidimensional array return type method
		return new Object[][] {{"bankim_cse@yahoo.com","Bankim@211084"},
		                       {"bankim_cse@yahoo.com","Bankim@211084"},
		                       {"bankim_cse@yahoo.com","Bankim@211084"}};
		
		
}
	@Test(dataProvider="testData")
	public void test(String sUsername,String sPassword) {
		WebDriverManager.chromedriver().setup();  //For version problem
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.out.println("GetChromeDriverOnMethod is running on Thread:" +Thread.currentThread().getId());
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class='c-kPcuI c-kPcuI-bNuZrP-muted-true c-kPcuI-kDmApp-disableVisited-true'])[8]")).click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys(sUsername);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(sPassword);
		//driver.findElement(By.xpath("(//*[@class='c-kPcuI c-kPcuI-bNuZrP-muted-true c-kPcuI-kDmApp-disableVisited-true'])[8]")).click();
	    driver.findElement(By.xpath("//*[@data-testid='signin-button']")).click();
	    driver.quit();
	}
}