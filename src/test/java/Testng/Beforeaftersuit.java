package Testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Beforeaftersuit {
    @BeforeSuite
    public void beforesuit() {
        System.out.println("Before suit");
    }

    @AfterSuite
    public void aftersuit() {
        System.out.println("After suit");
    }
}
