package com.QAAssignment.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver staticDriver;
	/*@Parameters({"browser"})
	@BeforeClass
	public void configBC(String BROWSER) throws Throwable {
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			staticDriver=driver;
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			staticDriver=driver;
		} 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(FileLib.getPropertyKeyvalue("url"));
	}*/
	
	@BeforeMethod
	public void init() throws Throwable {
		if(FileLib.getPropertyKeyvalue("browser").equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			staticDriver=driver;
		}else if(FileLib.getPropertyKeyvalue("browser").equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			staticDriver=driver;
		} 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(FileLib.getPropertyKeyvalue("url"));
	}
	
	@AfterMethod 
	public void close() {
		driver.close();
	}

}
