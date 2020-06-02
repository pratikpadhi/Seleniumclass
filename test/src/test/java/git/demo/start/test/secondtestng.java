package git.demo.start.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondtestng {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is before test_2");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is After test_2");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is before class_2");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after class_2");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("This is before suite_2");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("This is after suite_2");
	}
	@BeforeMethod
	public void beforethetestcase()
	{
		System.out.println("login to the application_2");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("logout_2");
	}
	
	
}
