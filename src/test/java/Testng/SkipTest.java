package Testng;

import org.testng.annotations.Test;

public class SkipTest {
    @Test(enabled = true)
    public void skiptest1() {
        System.out.println("skipping this test as it is not complete");
    }
}
