package com.Medec.Deploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    public static final String MEDECISION_HOME = "https://hnetest.medecision.com/ACM/login.faces";
    
    // The login page contains several HTML elements that will be represented as WebElements.
    By tf_Username = By.id("loginForm:userName");
    By tf_Password = By.id("loginForm:password");
    By btn_Login = By.id("loginForm:loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        navigateTo(MEDECISION_HOME); 
    }

    // The login page allows the user to type their username into the username field
    public LoginPage typeUsername(String username) {
    	setText(tf_Username, username);

        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
        return this;    
    }

    // The login page allows the user to type their password into the password field
    public LoginPage typePassword(String password) {
        setText(tf_Password, password);

        // Return the current page object as this action doesn't navigate to a page represented by another PageObject
        return this;    
    }

    // The login page allows the user to submit the login form
    public HomePage submitLogin() {
        // This is the only place that submits the login form and expects the destination to be the home page.
        // A seperate method should be created for the instance of clicking login whilst expecting a login failure.        
        click(btn_Login);

        // Return a new page object representing the destination. Should the login page ever
        // go somewhere else (for example, a legal disclaimer) then changing the method signature
        // for this method will mean that all tests that rely on this behaviour won't compile.
        return new HomePage(driver);    
    }

    // Conceptually, the login page offers the user the service of being able to "log into"
    // the application using a user name and password. 
    public HomePage loginAs(String username, String password) {
        // The PageObject methods that enter username, password & submit login have already defined and should not be repeated here.
        typeUsername(username);
        typePassword(password);
        return new HomePage(driver); 
    }
  
}
