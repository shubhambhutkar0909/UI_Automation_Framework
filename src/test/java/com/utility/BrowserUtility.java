package com.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.constants.Browser;

public abstract class BrowserUtility {

	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	Logger logger = LogManager.getLogger(this.getClass());

	public WebDriver getDriver() {
		return driver.get();
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver.set(driver);
	}

	/*
	 * public BrowserUtility(Browser browserName) {
	 * 
	 * if (browserName == Browser.CHROME) { driver.set(new ChromeDriver());
	 * 
	 * } else if (browserName == Browser.FIREFOX) { driver.set(new FirefoxDriver());
	 * } else if (browserName == Browser.EDGE) { driver.set(new EdgeDriver()); } }
	 */
	public BrowserUtility(Browser browserName, boolean isHeadless) {

		if (browserName == Browser.CHROME) {
			if (isHeadless) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless=new");
				options.addArguments("--window-size=1920,1080");
				driver.set(new ChromeDriver(options));
			} else {
				driver.set(new ChromeDriver());
			}

		} else if (browserName == Browser.FIREFOX) {
			if (isHeadless) {
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--headless=new");
				driver.set(new FirefoxDriver(options));

			}
			driver.set(new FirefoxDriver());
		} else if (browserName == Browser.EDGE) {
			if (isHeadless) {
				EdgeOptions options = new EdgeOptions();
				options.addArguments("--headless=new");
				options.addArguments("disable-gpu");
				driver.set(new EdgeDriver(options));

			} else {
				driver.set(new EdgeDriver());
			}
		}
	}

	public void goToWebsite(String url) {
		logger.info("Launching the URL");
		driver.get().get(url);

	}

	public void maximizeWindow() {
		logger.info("Maximizing the window");
		driver.get().manage().window().maximize();
	}

	public void clickOn(By locator) {
		WebElement element = driver.get().findElement(locator);
		logger.info("Element Found: and performing click::" + locator);

		element.click();
	}

	public void enterText(By locator, String textToEnter) {
		WebElement element = driver.get().findElement(locator);
		logger.info("Element Found: and Entering Text::" + textToEnter);

		element.sendKeys(textToEnter);
	}

	public String getVisibileText(By locator) {
		WebElement element = driver.get().findElement(locator);
		logger.info("Returning visible Text::" + element.getText());

		return element.getText();
	}

	public void quit() {
		driver.get().quit();
	}

}
