package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class MyAccountPage extends BrowserUtility{
	
	private static final By USER_NAME_LOC = By.xpath("//a[@title='View my customer account']/span");
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public String getUserName() {
		return getVisibileText(USER_NAME_LOC);
	}
	
	
}
