package testngdemo;

import org.testng.annotations.Test;

public class TestNGDemo4A 
{
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("Login test of TestNGDemo4A");
		System.out.println(0/0);
	}
	@Test(priority=2,dependsOnMethods="loginTest")
	public void customerDetails()
	{
		System.out.println("details of TestNGDemo4A");
	}


}
