
public class StaticDemo4B 
{

	public static void main(String[] args) 
	{
		StaticDemo3 s1 = new StaticDemo3();
		System.out.println(s1.j);
		System.out.println(s1.i);
		System.out.println(s1.a);
		System.out.println(s1.b);
		s1.b.funA();
	}

}
