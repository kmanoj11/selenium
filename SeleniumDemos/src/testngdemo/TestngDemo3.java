package testngdemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngDemo3 
{
	@Test
	public void funA()
	{
		System.out.println("funA of TestngDemo3");
	}


	@Test
	public void funB()
	{
		System.out.println("funB of TestngDemo3");
		System.out.println(0/0);
	}
	
	@Test
	public void funC() throws Exception
	{
		System.out.println("funC of TestngDemo3");
		//throw new Exception();
		throw new SkipException("Testng script demo");
	}
	
	@Test(enabled=false)
	public void funD()
	{
		System.out.println("funD of TestngDemo3");
	}
}
