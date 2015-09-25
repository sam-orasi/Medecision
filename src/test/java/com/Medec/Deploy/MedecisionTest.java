package com.Medec.Deploy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.Medec.Deploy.LoginPage;

public class MedecisionTest {

	private static WebDriver driver; 
//	private static final String MEDECISION_HOME = "https://hnetest.medecision.com/ACM/login.faces";
	   	
	/** Initialized class properties before excuting this class. */
	@BeforeClass
	public static void initializeClass(){
//	driver = new FirefoxDriver();
	driver = new InternetExplorerDriver();

	} 
      
    @Test  
    public void loginTest() {  
        LoginPage lp = new LoginPage(driver);  
        lp.loginAs("admin", "administrator");  
    }  
    
}
