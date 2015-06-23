package com.tests;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 	@Test
    public void test1()
    {
 		FirefoxDriver driver = new FirefoxDriver();
 		driver.get("http://www.gmail.com");
	System.out.println("this is test 1");
    }
 	
 	@Test
	public void test2()
	{
		System.out.println("this is test 2");
	}
 	
 	@Test
	public void test3()
	{
		System.out.println("this is test 3");
	}
 	
 	@Test
	public void test4()
	{
		System.out.println("this is test 4");
	}
}
