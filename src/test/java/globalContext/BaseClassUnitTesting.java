package globalContext;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class BaseClassUnitTesting {

    // These kind of global prints helps investigating reports/logs

    @BeforeSuite
    public void globalSuiteSetup(){
        System.out.println("This is global suite beforeMethod - runs once for all tests");
    }

    @BeforeMethod
    public void globalMethodSetup(Method testMethod){
        System.out.println("This is global beforeMethod - runs before every method");

//        String desc = testMethod.getAnnotation(Test.class).description();
//
//        System.out.println("Starting test: " +testMethod.getName() +
//                " with description: " + desc);
    }
}
