
public class MethodDemo7B 
{

	public static void main(String[] args) 
	{
     System.out.println("main method of MethodDemo7B");
     MethodDemo7B m1 = new MethodDemo7B();
     m1.funB();
     MethodDemo7B m2 = new MethodDemo7B();
     m2.funB();
     System.out.println("done");
	}
     void funA()
     {
    	 System.out.println("funA of MethodDemo7B");
    	  	 		
     }
     void funB()
     {
    	 System.out.println("funB of MethodDemo7");
    	 funA();
     }
}
