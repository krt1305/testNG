package com.parameters;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
    int counter=0;
    int retrylimit=3;

    public boolean retry(ITestResult iTestResult) {
        if(counter < retrylimit)
        {
            counter++;
            return true;
        }

        return false;
    }
}
