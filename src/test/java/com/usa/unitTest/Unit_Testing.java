package com.usa.unitTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Unit_Testing {
	WebDriver driver;
	@BeforeMethod
	public void getSetUp() {
		WebDriverManager.chromedriver().setup();  //For version problem
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.out.println("GetChromeDriverOnMethod is running on Thread:" +Thread.currentThread().getId());
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.zoopla.co.uk/");
		System.out.println("Browser is open");
	}
	@Test
public void getFunctionalTestOne() {
	driver.findElement(By.xpath("(//*[@class='c-kPcuI c-kPcuI-bNuZrP-muted-true c-kPcuI-kDmApp-disableVisited-true'])[8]")).click();
System.out.println("Test One");
	}
	@Test
public void getFunctionalTestTwo() {
		driver.findElement(By.xpath("(//*[@class='c-kPcuI c-kPcuI-bNuZrP-muted-true c-kPcuI-kDmApp-disableVisited-true'])[8]")).click();
		System.out.println("Test Two");
}
	@Test
public void getFunctionalTestThree() {
		driver.findElement(By.xpath("(//*[@class='c-kPcuI c-kPcuI-bNuZrP-muted-true c-kPcuI-kDmApp-disableVisited-true'])[8]")).click();
		System.out.println("Test Three");
	}
	@AfterMethod
public void tearDown() {
	driver.quit();
	System.out.println("Browser is close");
}
}
