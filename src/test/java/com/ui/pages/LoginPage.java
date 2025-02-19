package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility{

	private final static By EMAIL_ID_TXT_LOC = By.id("email");
	private final static By PASSWORD_TXT_LOC = By.id("passwd");
	private final static By SIGN_IN_BTN_LOC = By.id("SubmitLogin");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public MyAccountPage doLogin(String emailAddress, String password) {
		enterText(EMAIL_ID_TXT_LOC, emailAddress);
		enterText(PASSWORD_TXT_LOC, password);
		clickOn(SIGN_IN_BTN_LOC);
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		return myAccountPage;
	}
	
	
}
