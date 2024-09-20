
public class ThisDemo8 
{

	public static void main(String[] args) 
	{
    System.out.println(this);
	}
	static void funA()
	{
		System.out.println(this);
	}
	static 
	{
		System.out.println(this);
	}

}
