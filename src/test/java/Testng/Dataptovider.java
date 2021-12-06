package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataptovider {

    //Data provider defining way 1
    @DataProvider
    public Object[][] dataSet1()
    {
        //multi dimentional object array
        Object [][] dataset1 = new Object [4][2];

        //first row
        dataset1 [0][0]="user1";
        dataset1 [0][1]="pwd1";

        //second row
        dataset1 [1][0]="user2";
        dataset1 [1][1]="pwd2";

        //third row
        dataset1 [2][0]="user3";
        dataset1 [2][1]="pwd3";

        //fourth row
        dataset1 [3][0]="user4";
        dataset1 [3][1]="pwd4";
        
        return dataset1;


    }


    @Test(dataProvider = "dataSet1")
    public void test(String name, String pwd) {
        System.out.println(name+"===="+pwd);
    }




    // Data provider defining way 2

    @DataProvider
    public Object[][] dataSet2()
    {
        //multi dimentional object array

        return new Object[][]{
                {"username1","pwd1","test1"},
                {"username2","pwd2","test2"},
                {"username3","pwd3","test3"},
                {"username4","pwd4","test4"}


        };


    }

    @Test(dataProvider = "dataSet2")
    public void test2(String name, String pwd,String test) {
        System.out.println(name+"===="+pwd+"======="+test);
    }
}
