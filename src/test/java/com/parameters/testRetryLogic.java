package com.parameters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testRetryLogic {


    @Test( retryAnalyzer = com.parameters.RetryLogic.class)
    public void retryLogicTest()
    {
        Assert.assertEquals(false,true);
    }
}
