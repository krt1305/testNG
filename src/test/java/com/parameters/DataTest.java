package com.parameters;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataTest {



    @Test(dataProvider = "testData")
    //Params will be equal to no of columns
    //data type sent in testData should match with params data type
    public void loginTest(String username,String password,int id)
    {
        System.out.println("Username " +username + "Password "+password);
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.getClass().getSuperclass());

    }


    //IF DATA SET HAS TO BE SET PARALLELY THEN USE parallel=true
    @DataProvider(parallel =true)
    public Object[][] testData()
    {
        Object[][] data=new Object[2][3];
        data[0][0]="username1";
        data[0][1]="password1";
        data[0][2]=1;

        data[1][0]="username2";
        data[1][1]="password2";
        data[1][2]=2;
        return  data;

    }
}
