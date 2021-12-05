package Testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {

    boolean datasetup=true;

    @Test(enabled = true)
    public void skiptest1() {
        System.out.println("skipping this test as it is not complete");
    }

    @Test
    public void skiptest2() {
        System.out.println("skipping this test forcefully");
        throw new SkipException("Skip this test");
    }

    @Test
    public void skiptest3() {
        System.out.println("skipping based on condition");

        if(datasetup=false)
        {
            System.out.println("Execute the test");
        }
        else
        {
            System.out.println("do not execute further steps");
            throw new SkipException("do not execute further steps");
        }

    }

}
