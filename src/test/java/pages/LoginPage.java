package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    // Find the page object in this class
    // We are creating the constructor to  initialize (initiate) the page elements.
    // PageFactory.initElements  is used to initialize this page objects.
    public LoginPage(){
            PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "account-menu")
    public WebElement loginDropdown;

    @FindBy(id = "login-item")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    // We will create reusable login method
    //I will call this to login in the test classes to login
    public void loginApplication(String usernameButton, String passwordButton){  // this will take 2 parameters
        loginDropdown.click();
        signInButton.click();
        username.sendKeys(usernameButton);
        password.sendKeys(passwordButton);
        loginButton.click();

        // how can I call this method from other classes?
        //      LoginPage loginPge=new LoginPage(); <<<<<<===   create it at the class level)






    }




}
