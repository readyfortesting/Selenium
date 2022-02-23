package SeleniumENGLISH;

public class Page04_Xpath_CssSelector {


}

    /* There are 8 locators
    -> id,name,className,linkText,partialLinkText,xpath,cssSelector

    * How do we find an element?
    -> driver.findElement(By.id(""); it will return WebElement so
       WebElement elementname= driver.findElement(By.id("");

     * How do you get the text of element?
     -> String elementText=elementName.getText(); elementName it will return String.

     * List<WebElement> myElements=driver.findElements(By.xpath("xpath"));

     * There are 2 types of Xpaths. 1-Absolute xpath(it is almost never used) 2-Relative xpath
     Relative xpath:   //tag[@attribute='attributevalue']   ->with this xpath we can locate any elements.

     #NOTE# There are many ways to write an xppath.We can use any of the when it is needed.

   2.type of relative xpath  -> //*[@attribute='value']; Any tag   * means any (//[@class='form-control'])[2]
   3.tpe of relative xpath   -> //*[.='text name'];  Any tag and attribute just give me the text   . means any
     }

     */








