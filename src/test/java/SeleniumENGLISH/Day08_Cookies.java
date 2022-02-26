package SeleniumENGLISH;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class Day08_Cookies extends TestBase {

    @Test
    public void handleCookies(){
        //Go to amazon and automate the tasks:
        driver.get("https://www.amazon.com");

        // 1- Find the total number of cookies
        Set<Cookie> allCookies=driver.manage().getCookies();
        int numberOfCookies=allCookies.size();  // size(); it shows us all cookies
        System.out.println("numberOfCookies in Amazon.com = " + numberOfCookies); // numberOfCookies in Amazon.com = 8

            // 2- Print all the cookies
        for (Cookie eachCookie : allCookies){
            System.out.println("eachCookie = " + eachCookie);
            System.out.println("eachCookie Name = " + eachCookie.getName());
            System.out.println("eachCookie Value = " + eachCookie.getValue());
        }

        // 3- Get the cookies by their name.
        //When we want to get single cookie, we can get by cookie name.
        System.out.println("Cookie name sp-cdn : "+driver.manage().getCookieNamed("sp-cdn"));
        //Cookie name sp-cdn : sp-cdn="L5Z9:TR"; expires=Sun, 26 Feb 2023 09:58:19 EET; path=/; domain=.amazon.com;secure;


        // 4- Add new cookie.

        //Step 1 > CREATE COOKIES OBJECT
        Cookie cookie=new Cookie("My-Fav-Cookie","White-Chocolate");

        //Step 2 > ADD COOKIE
       driver.manage().addCookie(cookie);
    // Check it if cookie is added.
        allCookies=driver.manage().getCookies();
        System.out.println(allCookies.size());// 9

        // 5- Delete cookie by name.
     driver.manage().deleteCookieNamed("session-id");

        // 6- Delete all the cookies.
        driver.manage().deleteAllCookies();
        //check it if all cookies are deleted
        allCookies=driver.manage().getCookies();
        System.out.println(allCookies.size());//0


    }
}
