package pack1;
import java.lang.reflect.Method;
public class PrivateDemo2 
{
	PrivateDemo2()
	{
		System.out.println("cons of PrivateDemo2");
	}
  private int a = 10;
  private void funA()
  {
	  System.out.println("funA ofPrivateDemo2");
  }
  void funB()
  {
	  System.out.println(a);
	  funA();
	  System.out.println("funB of PrivateDemo2");
	  
  }
  
}
