package com.parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {


    @Parameters({"url","emailid"})
            @Test
            public void testParams(String url,String password)
            {

                System.out.println("Url is "+url);
                System.out.println("password is "+ password);
            }

    @Parameters({"optionalParam","emailid"})
            @Test
            public void optionalTest(@Optional("optional value") String optionalParam, String emailid)
            {
                System.out.println("email id is "+emailid);
                System.out.println("optionalParam is"+ optionalParam);

            }

/* if para is optional use @Optional annotation*/



}
