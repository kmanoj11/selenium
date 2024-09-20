
public class PolyDemo3A 
{

	public static void main(String[] args)
	{
	    funA(20,true);
	    funA(true,30);
		}
	static void funA(int a,boolean b)
	 {
		 System.out.println("int boolean args of funA");
	 }
	static void funA(boolean b,int a)
	 {
		 System.out.println("boolean int args of funA");
	}

}
