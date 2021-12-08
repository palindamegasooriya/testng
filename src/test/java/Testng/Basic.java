package Testng;

import org.testng.annotations.*;

public class Basic extends Beforeaftersuit{
    @Test(priority = 1, groups = "one")
    public void atest() {
        System.out.println("atest");
    }

    @Test(priority = 0, groups = "one")
    public void btest() {
        System.out.println("btest");
    }

    @Test(priority = 2, groups = "two")
    public void ctest() {
        System.out.println("ctest");
    }

    @BeforeGroups(value = "one")
    public void beforegroup() {
        System.out.println("before group");
    }

    @BeforeClass
    public void login() {System.out.println("login");}

    @AfterClass
    public void afterClass() {System.out.println("logout");}

    @AfterMethod
    public void tearDown() {
        System.out.println("close connection");
    }


    @BeforeMethod
    public void setUp() {
        System.out.println("make connection");
    }
}
