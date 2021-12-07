package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
    @Test(groups = "one")
    public void check() {
        String a="painda";
        String b="paida";
        Assert.assertNotEquals(a,b);
    }
}
