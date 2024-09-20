package testngdemo;

import org.testng.annotations.Test;

public class demo1 
{
	@Test(priority=2)
	void funA()
	{
		System.out.println("funA of demo1");
	}
	@Test(priority=1)
	void funB()
	{
		System.out.println("funB of demo1");
	}
	@Test(priority=3)
	void funC()
	{
		System.out.println("funC of demo1");
	}
	@Test(priority=4)
	void funD()
	{
		System.out.println("funD of demo1");
	}
	@Test
	void funE()
	{
		System.out.println("funE of demo1");
	}

}
