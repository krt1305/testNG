package com.listeners;

import org.testng.annotations.*;

//http://toolsqa.com/selenium-webdriver/testng-listeners/

@Listeners(Listener.class)
public class TestListener {


    @BeforeSuite
    public void beforeSuiteTest()
    {
        System.out.println("in beforeSuiteTest");
    }

    @AfterSuite
    public void afterSuiteTest()
    {
        System.out.println("in afterSuiteTest");
    }

    @Test
    public void test1()
    {
        System.out.println("in test1");
    }

    @Test
    public void test2()
    {
        System.out.println("in test2");
    }


}
