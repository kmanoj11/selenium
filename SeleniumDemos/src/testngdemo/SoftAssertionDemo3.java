package testngdemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Assert all functions need to use
public class SoftAssertionDemo3 
{
	@Test
	   public void funA()
	   {
		   System.out.println("funA of SoftAssertionDemo1");
		   SoftAssert saAssert = new SoftAssert();
		   saAssert.assertEquals("RBG Technologies", "RBG Technologies");
		   System.out.println("Testcase1 is completed");
		   
		   
		   saAssert.assertEquals("RBG Technologies", "Selenium");
		   System.out.println("Testcase2 is completed");
		   saAssert.assertAll();
		   System.out.println("Done");
	   }

}
