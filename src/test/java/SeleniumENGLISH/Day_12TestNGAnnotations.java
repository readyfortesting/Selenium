package SeleniumENGLISH;

/* ====TestNG===== It is an automation framework type.
=> TestNG is an open source, new generation and  advance version of JUnit.
=> Everything in junit is also in TestNG (Assertions,logic,annotation,@Before @After annotations)
=> TestNG is specifically for testers, developers usually use JUnit for their unit testing, testers are using TestNG fot automation testing
=> TestNG has more annotation,more feature, more assertion types
=> TestNG has soft Assertion but JUnit doesn't have.
=> TestNG works only with Java and requires JDK 7 or higher.
=> We can have more control with TestNG,MORE FLEXIBILITY, MORE ANNOTATIONS.
=> testng/xml files we will learn it for grouping the test cases.
=> @dataprovider we will learn in TestNG

=> Why we learn testNG??
 TestNG is more popular and has more features

LET'S LEARN TESTNG ANNOTATIONS

=>    @Test : Creates test case.
=>    @BeforeMethod : This runs Before each @Test annotation. Same as @Before annotation in JUnit.
=>    @AfterMethod : This runs after each @Test annotation.  Same as @After annotation in JUnit.
=>    @Ignore : For example I don't want to run test2() we use @Ignore annotation.
=>    @Test(enabled = false) : it means DISABLE. You cannot run this test ANYMORE! It removes run button!
=>    @Test(Priority) : TestNG runs in ALPHABETICAL ORDER. We use priority to order test cases.

  ****   WHY DO YOU NEED @BeforeMethod? *****
  => Pre conditions: Create driver, implicitly Wait,maximize Window, it is used TO AVOID REPETITION.

  ****   WHY DO YOU NEED @AfterMethod? *****
  => Post conditions : Closing driver, reports generation, close=quit driver, it is  also used TO AVOID REPETITION.

    ****   WHY DO YOU NEED @Test annotation? *****
  => To create test scripts (test cases)

     ASSERTION
     Hard asserion > if hard assertion fails,remaining test cases will not run.
     SoftAssert=>  If soft assert fails,the test case will continue to run.

 */

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day_12TestNGAnnotations {

    @BeforeMethod
    public void setUp(){
        System.out.println("This is before method");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("This is after method");

    }
    @Test(enabled = false) // it means DISABLE. You cannot run this test ANYMORE!
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test
    @Ignore
    public void test2() {
        System.out.println("This is test 2");
    }
        @Test(priority = 2)
        public void test5(){
            System.out.println("This is test 5");
        }

    @Test(priority = 3)
    public void test3(){
        System.out.println("This is test 3");

    }
    @Test(priority = 1)
    public void test4(){
        System.out.println("This is test 4");


    }

    }