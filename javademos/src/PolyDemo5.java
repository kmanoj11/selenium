
public class PolyDemo5 
{

	public static void main(String[] args) 
	{
		PolyDemo5 p1 = new PolyDemo5();
		p1.funA(200,100l);
		p1.funA(100l,20);
	}
	void funA(int a,long b)
	{
		System.out.println("int long args of PolyDemo5");
	}
    void funA(long b,int a)
    {
    	System.out.println("long int args of PolyDemo5");
    }
}
