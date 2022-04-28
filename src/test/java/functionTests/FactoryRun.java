package functionTests;


import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryRun {

    @Factory
    @Test
    public Object[] runTwoClass() {
        Object[] factoryTest = new Object[2];
        factoryTest[0] = new MainTest();
        factoryTest[1] = new FactoryRun();
        return factoryTest;
    }

}
