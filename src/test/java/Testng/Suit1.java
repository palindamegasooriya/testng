package Testng;

import org.testng.annotations.Test;

public class Suit1 extends Beforeaftersuit{
    @Test
    public void one() {
        System.out.println("one");
    }

    @Test
    public void two() {
        System.out.println("two");
    }
}
