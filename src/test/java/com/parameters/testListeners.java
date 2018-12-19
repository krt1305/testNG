package com.parameters;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

        System.out.println("Test started "+iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("Test passed "+iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println("Test failed "+iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

        System.out.println("Test skipped "+iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
