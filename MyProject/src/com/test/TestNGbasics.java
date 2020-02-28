package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {
	//Pre-conditons -- starting with @Before
	@BeforeSuite
	public void setUp() {
	System.out.println("setup system property for chrome");
		
	}
	
	@BeforeClass
	public void launchBrowser() {
	System.out.println("launch chrome Browser");
 }

    @BeforeMethod
    public void enterURL() {
    	System.out.println("enter URL");
    	
    }

    @BeforeTest
    public void login() {
    	
    	System.out.print("login method");
    }

  //test cases -- startint with @Test
   @Test
   public void googleTitletest() {
	 System.out.println("Google title test");  
	  }
   @Test
   public void searchTest(){
	   System.out.println("search Test");
   }
   
   @Test
   public void googleLogotest(){
	   System.out.println("google logo test");
   }
  // post conditions -- starting with @After
   @AfterMethod
   public void logout() {
	   System.out.println("logout from app");
   }
   
   @AfterClass
   public void closeBrowser(){
	   System.out.println("Close Browser");
   }

   @AfterTest
   public void deleteAllCookies(){
	   System.out.println("deleteAllCookies");
	   
	   
   }
   
  
   
  
   
   
}
