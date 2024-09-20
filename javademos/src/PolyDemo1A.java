
public class PolyDemo1A
{

	public static void main(String[] args)
	{
		funA();
		funA(10);
		funA(20);
		funA(20.0f);
		funA(20.00);
		funA('d');
		funA(true);
		
		
		
		
		
		
	}
 static void funA()
 {
	 System.out.println("Zero args of funA");
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
 static void funA(char f)
 {
	 System.out.println("char args of funA");
 }
 static void funA(boolean g)
 {
	 System.out.println("boolean args of funA");

	}

}
