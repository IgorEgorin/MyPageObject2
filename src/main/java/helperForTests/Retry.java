package helperForTests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    private int currentCount = 0;
    private static int MAX_COUNT = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (currentCount < MAX_COUNT){
            currentCount++;
            return true;
        }
        return false;
    }
}
