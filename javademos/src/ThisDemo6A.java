
public class ThisDemo6A
{
	int i = 5;
	ThisDemo6A()
	{
		System.out.println("zero args cons of ThisDemo5A");
		i=10;
	}
	ThisDemo6A(int a)
	{
		this();
		System.out.println("int args cons of ThisDemo5A");
		i=a;
	}
	public static void main(String[] args)
	{
      System.out.println("main method starts");
      ThisDemo6A t1 = new ThisDemo6A();
      System.out.println(t1.i);
      System.out.println("done");
	}
	

	

}
