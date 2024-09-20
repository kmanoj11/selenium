
public class MethodDemo6
{

	public static void main(String[] args) 
	{
     System.out.println("main method of MethodDemo5");
     funB();
     System.out.println("done");
	}
     void funA()
     {
    	 System.out.println("funA of MethodDemo5");
    	 
     }
     static void funB()
     {
    	System.out.println("funB of MethodDemo5");
    	MethodDemo5 m1 = new MethodDemo5();
    	m1.funA();
     }
}
