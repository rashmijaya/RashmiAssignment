package com.QAAssignment.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QAAssignment.genericLib.WebdriverUtility;

public class AssignmentPage {
	
	WebDriver driver;
	public AssignmentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="text1")
	private WebElement searchTermTF;
	
	@FindBy(id="text2")
	private WebElement searchContextTF;
	
	@FindBy(xpath = "//button[text()='Find']")
	private WebElement findBtn;
	public WebElement getTextField1() {
		return searchTermTF;
	}

	public WebElement getTextField2() {
		return searchContextTF;
	}

	public WebElement getFindBtn() {
		return findBtn;
	}
	
	public String getOccurance(String text1,String text2) {
		searchTermTF.sendKeys(text1);
		searchContextTF.sendKeys(text2);
		findBtn.click();
		String text = WebdriverUtility.getAlertText(driver);
		WebdriverUtility.alertAccept(driver);
		return text;
	}


}
