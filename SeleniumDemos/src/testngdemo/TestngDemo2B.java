package testngdemo;

import org.testng.annotations.Test;

public class TestngDemo2B 
{
	@Test(priority=3)
	public void funA()
	{
		System.out.println("funA of TestngDemo2");
	}


	@Test(priority=1)
	public void funB()
	{
		System.out.println("funB of TestngDemo2");
	}
	
	@Test(priority=4)
	public void funC()
	{
		System.out.println("funC of TestngDemo2");
	}
	
	@Test(priority=2)
	public void funD()
	{
		System.out.println("funD of TestngDemo2");
	}
}
