package com.QAAssignment.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebdriverUtility {
	
	public static void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public static String getAlertText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	
	public static void getScreenshot(WebDriver driver,String name) throws IOException {
		EventFiringWebDriver event=new EventFiringWebDriver(driver);
		File src = event.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+name+".png");
		FileUtils.copyFile(src, dest);
	}

}
