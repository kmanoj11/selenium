
public class ThisDemo3 
{
	ThisDemo3()
	{
		System.out.println("zero args of ThisDemo3");
	}
	ThisDemo3(int a)
	{
		System.out.println("int args of ThisDemo3");
	}
	

	public static void main(String[] args) 
	{
		ThisDemo3 t1 = new ThisDemo3();
		
		ThisDemo3 t2 = new ThisDemo3(10);
	}

}
