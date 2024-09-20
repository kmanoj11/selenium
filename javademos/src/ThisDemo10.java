
public class ThisDemo10 
{
	ThisDemo10()
	{
		this();
		System.out.println("zero args cons of ThisDemo10");
		
	}

	ThisDemo10(int a)
	{
		this(20);
		System.out.println("int args cons of ThisDemo10");
	
	}
	public static void main(String[] args) 
	{

	}

}
