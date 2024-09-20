
public class StaticDemo1A 
{
  static A a1 = new A();
	public static void main(String[] args)
	{
		System.out.println("main method start");
		System.out.println(a1.i);
		a1.funA();
		System.out.println("Done");
		
	}

}
