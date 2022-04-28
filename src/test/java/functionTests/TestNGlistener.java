package functionTests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlistener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test is started " + result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test is success " + result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test is failure " + result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test is skipped " + result.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Типа сработал процент неудач");
    }
}
