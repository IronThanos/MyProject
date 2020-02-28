package com.test;

import org.testng.annotations.Test;

public class TestngFeatures {

	@Test
	public void login() {
		
		System.out.println("login test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="login")
	public void HomePagetest() {
		
		System.out.println("Home page test");
		
	}
	
	@Test(dependsOnMethods="login")
	public void Searchpagetest() {
		
		System.out.println("login test");
		
	}
	
	@Test(dependsOnMethods="login")
	public void RegPageTest() {
		
	System.out.println("RegPageTest ");
		
    }
}