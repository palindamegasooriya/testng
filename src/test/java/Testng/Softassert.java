package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class Softassert {

    @Test
    public void softassert() {

        SoftAssert sa=new SoftAssert();

        String actualname="painda";
        String expectedname="panda";

        int actualage=26;
        int expectedage=25;

        System.out.println("compare name");

        //messege display only show when assertion fails.
        sa.assertEquals(actualname,expectedname,"name not match");

        System.out.println("compare age");
        sa.assertEquals(actualage,expectedage,"age not match");

        System.out.println("close all");

        //to report all faliures
        sa.assertAll();

        System.out.println("Hi");




    }
}
