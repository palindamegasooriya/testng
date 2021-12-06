package Testng;

import org.testng.annotations.Test;

public class Dataptovider3 {

    @Test(dataProvider = "dset1",dataProviderClass =Dataset.class)
    public void test(String name, String pwd) {
        System.out.println(name+"===="+pwd);
    }

    @Test(dataProvider = "dset2", dataProviderClass = Dataset.class)
    public void test2(String name, String pwd,String test) {
        System.out.println(name+"===="+pwd+"======="+test);
    }
}
