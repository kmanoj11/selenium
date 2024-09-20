
public class PolyDemo2 
{

	public static void main(String[] args) 
	{
		PolyDemo2 p1 = new PolyDemo2();
		p1.funA(10);
		p1.funA(10,10);
	}
  void funA(int a)
  {
	  System.out.println("int args of funA");
  }
  void funA(int a, int b)
  {
	  System.out.println("int int args of funA");
  }
}
