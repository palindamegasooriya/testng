package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retryeffect {

    @Test(retryAnalyzer = Retry.class)
    public void retry() {
        System.out.println("Hello");
        Assert.assertTrue(true);
    }
}
