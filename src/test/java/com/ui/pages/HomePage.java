package com.ui.pages;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;

import static com.utility.PropertiesUtil.*;

public final class HomePage extends BrowserUtility{
	
	Logger logger = LogManager.getLogger(this.getClass());

	
	public HomePage(Browser BrowserName, boolean isHeadless) {
		super(BrowserName, isHeadless);
		logger.info("Calling Go to website on local");
		goToWebsite(JSONUtility.readJson(QA).getUrl());

		maximizeWindow();
	}

	public HomePage(WebDriver driver) {
		super(driver);
		goToWebsite(JSONUtility.readJson(QA).getUrl());

	}

	private final static By SIGN_IN_LINK_LOC = By.xpath("//a[contains(text(),'Sign in')]");
	
	public LoginPage goToLoginPage() {
		logger.info("Trying to Perform Click to go to Sign in Page!");
		clickOn(SIGN_IN_LINK_LOC);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}


}
