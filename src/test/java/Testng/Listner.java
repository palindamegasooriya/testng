package Testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case is starting");
    }
}
