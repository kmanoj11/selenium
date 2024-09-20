
public class PolyDemo1B 
{

	public static void main(String[] args) 
	{
		PolyDemo1B p1 = new PolyDemo1B();
		p1.funA(10);
		p1.funA(100);
		p1.funA(10.5f);
		p1.funA(20.00);
		
	}
	void funA(int a)
    {
		System.out.println("int args of funA");
	}
	void funA(long b)
	{
		System.out.println("long args of funA");
	}
	void funA(float c)
	{
		System.out.println("float args of funA");
	}
    void funA(double d)
    {
    	System.out.println("double args of funA");
    }
}
