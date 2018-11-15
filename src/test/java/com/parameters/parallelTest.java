package com.parameters;

import org.testng.annotations.Test;

public class parallelTest {

    @Test(threadPoolSize = 3,invocationCount = 10)
    public void parallelTest()
    {

        System.out.println("parallel test");
    }
}
