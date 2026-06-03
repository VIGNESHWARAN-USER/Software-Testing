package com.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.test.BaseTest;


public class Listener extends BaseTest implements ITestListener {
	private static final Logger log = LogManager.getLogger(Listener.class);

	public void onStart(ITestContext context) {
		System.out.println("Execution started: " + context.getName());
		context.setAttribute("startTime", System.currentTimeMillis());
	}

	public void onTestFailure(ITestResult Result) {
		log.error("The name of the testcase failed is :" + Result.getName());
	}

	public void onTestSkipped(ITestResult Result) {
		log.warn("The name of the testcase Skipped is :" + Result.getName());
	}

	public void onTestStart(ITestResult Result) {
		log.info(Result.getName() + " test case started");
	}

	public void onTestSuccess(ITestResult Result) {
		log.info("The name of the testcase passed is :" + Result.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Passed: " + context.getPassedTests().size());
		System.out.println("Failed: " + context.getFailedTests().size());
	}
}
