package com.ui.listeners;

import org.apache.commons.beanutils.PropertyUtils;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.Env;
import com.utility.JSONUtility;
import com.utility.PropertiesUtil;

public class MyRetryAnalyzer implements IRetryAnalyzer {

	//private final static int MAX_NO_OF_ATTEMPTS = Integer.parseInt(PropertiesUtil.readProperty(Env.QA, "MAX_NO_OF_ATTEMPTS"));
	private final static int MAX_NO_OF_ATTEMPTS = JSONUtility.readJson(Env.QA).getMAX_NO_OF_ATTEMPTS();
	private static int currentAttempt = 1;

	@Override
	public boolean retry(ITestResult result) {
		if (currentAttempt <= MAX_NO_OF_ATTEMPTS) {
			currentAttempt++;
			return true;
		}

		return false;
	}

}
