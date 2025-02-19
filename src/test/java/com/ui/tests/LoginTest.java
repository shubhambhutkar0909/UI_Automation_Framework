package com.ui.tests;

import static com.constants.Browser.*;

import static org.testng.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pojo.User;
import com.utility.LoggerUtility;

@Listeners({ com.ui.listeners.TestListerner.class })
public class LoginTest extends TestBase {

	Logger logger = LogManager.getLogger(this.getClass());

	@Test(description = "Verifies Valid User able to Login to application", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.dataprovider.LoginDataProvider.class, dataProvider = "LoginTestJSONDataProvider", retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	public void loginTest(User user) {

		assertEquals(homePage.goToLoginPage().doLogin(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Shubham B");
	}

	/*
	 * @Test(description = "Verifies Valid User able to Login to application",
	 * groups = { "e2e", "sanity" }, dataProviderClass =
	 * com.ui.dataprovider.LoginDataProvider.class, dataProvider =
	 * "LoginTestCSVDataProvider") public void loginCSVTest(User user) {
	 * 
	 * assertEquals(homePage.goToLoginPage().doLogin(user.getEmailAddress(),
	 * user.getPassword()).getUserName(), "Shubham B"); }
	 * 
	 * @Test(description = "Verifies Valid User able to Login to application",
	 * groups = { "e2e", "sanity" }, dataProviderClass =
	 * com.ui.dataprovider.LoginDataProvider.class, dataProvider =
	 * "LoginTestExcelDataProvider") public void loginExcelTest(User user) {
	 * assertEquals(homePage.goToLoginPage().doLogin(user.getEmailAddress(),
	 * user.getPassword()).getUserName(), "Shubham B");
	 * 
	 * }
	 */
}
