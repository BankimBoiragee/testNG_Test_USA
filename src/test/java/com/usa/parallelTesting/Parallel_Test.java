package com.usa.parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Test {
	@Test
	public void getNode1() {
		WebDriverManager.chromedriver().setup();  //For version problem
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.out.println("GetChromeDriverOnMethod is running on Thread:" +Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		ClassA.getTest1();
		ClassA.getTest2();
	}
	@Test
	public void getNode2() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.out.println("GetChromeDriverOnMethod is running on Thread:" +Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		ClassA.getTest3();
		ClassB.getTest4();
		ClassB.getTest5();
	}
	@Test
	public void getNode3() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.out.println("GetChromeDriverOnMethod is running on Thread:" +Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		ClassB.getTest6();
		ClassC.getTest7();
	}
	@Test
	public void getNode4() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.out.println("GetChromeDriverOnMethod is running on Thread:" +Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		ClassC.getTest8();
		ClassC.getTest9();
	}
	
}
