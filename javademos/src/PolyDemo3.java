
public class PolyDemo3 
{

	public static void main(String[] args)
	{
	 PolyDemo3 p1 = new PolyDemo3();
     p1.funA(20,true);
     p1.funA(true,30);
	}
 void funA(int a,boolean b)
 {
	 System.out.println("int boolean args of funA");
 }
 void funA(boolean b,int a)
 {
	 System.out.println("boolean int args of funA");
 }

}
