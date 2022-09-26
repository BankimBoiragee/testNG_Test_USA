package com.usa.crossBrowserTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser_Test {
	WebDriver driver;
	@BeforeTest           //Basic anotation
	@Parameters("browser") //Advance anotation browser as a argument
	public void setUp(String browser){
		if(browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();	//To reduce version problem
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();;
			//System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Browser not found");
		}
			}
	@Test
	public void testParameterWithXML() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class='c-kPcuI c-kPcuI-bNuZrP-muted-true c-kPcuI-kDmApp-disableVisited-true'])[8]")).click();
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("bankim_cse@yahoo.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Bankim@211084");
		//driver.findElement(By.xpath("(//*[@class='c-kPcuI c-kPcuI-bNuZrP-muted-true c-kPcuI-kDmApp-disableVisited-true'])[8]")).click();
	    driver.findElement(By.xpath("//*[@data-testid='signin-button']")).click();
	    driver.quit();
	}

}
