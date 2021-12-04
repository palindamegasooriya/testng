package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
    @Test
    public void check() {
        String a="painda";
        String b="painda";
        Assert.assertNotEquals(a,b);
    }
}
