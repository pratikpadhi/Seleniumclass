package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firsttestng {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is before test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is After test");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after class");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("This is before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("This is after suite");
	}
	@BeforeMethod
	public void beforethetestcase()
	{
		System.out.println("login to the application");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("logout");
	}
	
	@Test
	public void testcas1()
	{
		
		System.out.println("Place an order for laptop");
		
	}
	@Test
	public void testcas2()
	{
		System.out.println("place an order for mobile");
		
	}
	@Test
	public void testcas3()
	{
		System.out.println("place an order for tv");
		
	}

}
