package com.ui.listeners;

import java.util.Arrays;

import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.utility.LoggerUtility;

public class TestListerner implements ITestListener {
	Logger logger = LoggerUtility.getLogger(this.getClass());

	@Override
	public void onTestStart(ITestResult result) {
		logger.info(result.getMethod().getMethodName());
		logger.info(result.getMethod().getDescription());
		logger.info(Arrays.toString(result.getMethod().getGroups()));

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info(result.getMethod().getMethodName()+ " :: " +"PASSED");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.error(result.getMethod().getMethodName()+ " :: " +"FAILED");
		logger.error(result.getThrowable().getMessage());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.warn(result.getMethod().getMethodName()+ " :: " +"SKIPPED");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		logger.info("Test Suite is Started!!");

	}

	@Override
	public void onFinish(ITestContext context) {
		logger.info("Test Suite is Completed!!");

	}

}
