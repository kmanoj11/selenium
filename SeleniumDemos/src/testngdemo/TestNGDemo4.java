package testngdemo;

import org.testng.annotations.Test;

public class TestNGDemo4 
{
	@Test(priority=1)
 public void loginTest()
 {
	 System.out.println("Login test of TestNGDemo4");
	 System.out.println(0/0);
 }
	@Test(priority=2)
  public void customerDetails()
  {
	  System.out.println("details of TestNGDemo4");
  }
}
