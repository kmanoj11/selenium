
public class MethodDemo8A 
{

	public static void main (String[]args)
	{
		MethodDemo8A m1 = new MethodDemo8A();
		m1.funA(30);
		m1.funB(60);
		m1.funC(10.0f);
		m1.funD(20.0);
		m1.funE('c');
		m1.funF(false);
	}
   void funA(int c)
   {
	   System.out.println("funA of MethodDemo8A");
   }
    void funB(long l)
   {
	   System.out.println("funB of MethodDemo8A");
   }
   void funC(float f)
   {
	   System.out.println("funC of MethodDemo8A");
	   
	   
   }
   void funD(double d)
   {
	   System.out.println("funD of MethodDemo8A");
	   
	   
   }
   void funE(char c)
   {
	   System.out.println("funE of MethodDemo8A");
   }
  void funF(boolean b)
  {
	  System.out.println("funF of MethodDemo8A");
	  
	  
  }
}
