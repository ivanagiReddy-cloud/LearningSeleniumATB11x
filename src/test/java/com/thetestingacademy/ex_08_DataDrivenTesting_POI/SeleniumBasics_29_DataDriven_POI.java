package com.thetestingacademy.ex_08_DataDrivenTesting_POI;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumBasics_29_DataDriven_POI extends CommonToAll {


    @Test(dataProvider = "getData")
    public void test_POI(String username, String password) {

        System.out.println(username + "|" + password);
    }


    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"Sivanagi", "password1"},
                new Object[]{"Reddy", "password2"},
                new Object[]{"Nagireddy", "Password3"}
        };
    }
}
