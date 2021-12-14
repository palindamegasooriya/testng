package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {

    @Test
    public void atest() {
        Reporter.log("This is test 1");
        System.out.println("atest");
    }

    @Test
    public void btest() {
        System.out.println("btest");
    }
}
