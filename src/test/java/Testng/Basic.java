package Testng;

import org.testng.annotations.*;

public class Basic {
    @Test(priority = 1)
    public void atest() {
        System.out.println("atest");
    }

    @Test(priority = 0)
    public void btest() {
        System.out.println("btest");
    }

    @Test(priority = 2)
    public void ctest() {
        System.out.println("ctest");
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
