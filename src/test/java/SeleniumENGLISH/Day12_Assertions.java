package SeleniumENGLISH;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day12_Assertions {

    @Test
    public void hardAssert(){
        // import org.testng.Assert;    This is HARD ASSERT !!
        System.out.println("This is line 8");
        Assert.assertEquals(4,5); // fail

        System.out.println("This is line 12"); // Hard assert fails, and next line will not RUN!!
        //Testers usually use hard assertions, because if something is wrong we don't have to continue.




    }
    @Test
    public void softAssert(){
        /* to use SoftAssert we must to create SoftAssert object

        -> 1. create a SoftAssert object
        SoftAssert softAssert=new SoftAssert();  // it comes from TestNG

 *** BE CAREFULL when you use soft assertion!

     -> At the end we must use assertAll(); to check which one pass which one fails.


         */

        SoftAssert softAssert=new SoftAssert();
        System.out.println("This is line 33");
        softAssert.assertEquals(5,5); // fail.    This will be on the console because it will FAILED
        System.out.println("This is line 35");
        softAssert.assertTrue("Java".contains("e")); // fail.  This will be on the console because it will FAILED
        System.out.println("This is line 37");
        softAssert.assertEquals(10,11); // fail.    This will be on the console because it will FAILED
        softAssert.assertEquals(5,5);// pass.    This will not on the console because it will PASS


        softAssert.assertAll();  // it actually does the ASSERTION.


        // What is  SOFT ASSERTION??? => Verifying all test cases using soft assertion.
        // In this type of assertion, we use soft assert object. It is like if else statement, if the test fails it continue.
        // This will not throw exception!
        // We also use at the end assertAll() to acctually see if any soft assert fails.



        // What is the difference between hard and soft asserton??
// Hard Assert: If hard assert fails, the test case will not continue to run.
        //Soft assert: If soft assert fails, the test case will continue to run.
        // We must create SoftAssert object to use soft assert.

        // Which assertion do you prefer,Why?
        // Teacher's answer: I prefer Hard assertion,because if a step fails, I should immediately check the issue without waiting our time.
       // Sometimes, I use soft assert when I write my initial test cases. Then I see what fails what pass at the end.
        // soft assert is good for writing scratch work.

    }

}
