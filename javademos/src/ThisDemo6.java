
public class ThisDemo6 
{
	ThisDemo6()
	{
		this(20);
		System.out.println("zero args cons of ThisDemo6");
	}
	ThisDemo6(int a)
	{
		System.out.println("int args cons of ThisDemo6");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method starts");
		ThisDemo6 t1 = new ThisDemo6();
		System.out.println(t1);
		System.out.println("done");

	}

}
