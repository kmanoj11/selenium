
public class ThisDemo5A 
{
	int i = 5;
	ThisDemo5A()
	{
		System.out.println("zero args cons of ThisDemo5A");
		i=10;
	}
	ThisDemo5A(int a)
	{
		this();
		System.out.println("int args cons of ThisDemo5A");
		i=a;
	}
	public static void main(String[] args)
	{
      System.out.println("main method starts");
      ThisDemo5A t1 = new ThisDemo5A();
      System.out.println(t1);
      System.out.println("done");
	}

}
