
public class PolyDemo1C 
{

	public static void main(String[] args) 
	{
		funA(10);
		funA(100);
		funA(10.5f);
		funA(20.00);
		
	}
	static void funA(int a)
	{
		System.out.println("int args of funA");
	}
	static void funA(long b)
	{
		System.out.println("long args of funA");
	}
	static void funA(float c)
	{
		System.out.println("float args of funA");
	}
	static void funA(double d)
    {
    	System.out.println("double args of funA");
	}

}
