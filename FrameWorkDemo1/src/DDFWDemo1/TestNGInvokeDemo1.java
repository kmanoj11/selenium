package DDFWDemo1;

import org.testng.annotations.Test;

public class TestNGInvokeDemo1 
{
	@Test(invocationCount=3)
	public void funA()
	{
		System.out.println("funA of TestNGInvokeDemo1 ");
	}
	

}
