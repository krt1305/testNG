package com.listeners;

import org.testng.*;

public class Listener implements ISuiteListener, ITestListener {


    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("suite start");
    }

    @Override
    public void onFinish(ISuite iSuite) {
        System.out.println("suite end");
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

        System.out.println("test start" +iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("test passed "+iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println("test failed "+iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

        System.out.println("test skipped "+iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

        System.out.println("test context start "+iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

        System.out.println("test context end " +iTestContext.getName());
    }
}
