package com.ui.tests;

import static com.constants.Browser.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LambdaTestUtility;

public class TestBase {

	protected HomePage homePage;
	Logger logger = LogManager.getLogger(this.getClass());
	private boolean isLambdaTest;
	//private boolean isHeadless = true;
	
	@Parameters({"browser","isLambdaTest","isHeadless"})
	@BeforeMethod(description = "Load the HomePage of Website")
	public void setup(
			@Optional("chrome") String browser, 
			@Optional("false") boolean isLambdaTest, 
			@Optional("true") boolean isHeadless, ITestResult result) {
		
		WebDriver lambdaDriver;
		this.isLambdaTest = isLambdaTest;
		
		if (isLambdaTest) {
			logger.info("Load the HomePage of Website on LamdaTest");
			lambdaDriver = LambdaTestUtility.initalizeLambdaTestSession(browser, result.getMethod().getMethodName());
			homePage = new HomePage(lambdaDriver);
			
		} else {
			logger.info("Load the HomePage of Website");
			homePage = new HomePage(Browser.valueOf(browser.toUpperCase()), isHeadless);

		}

	}

	public BrowserUtility getInstance() {
		return homePage;
	}

	@AfterMethod(description = "Tear down Browser session")
	public void tearDown() {
		if(isLambdaTest) {
			LambdaTestUtility.quitSession();
		}else {
			homePage.quit();	
		}
		
		
	}
}
