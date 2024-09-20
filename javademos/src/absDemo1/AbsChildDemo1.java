package absDemo1;

public class AbsChildDemo1 extends AbsDemo5
{
	AbsChildDemo1()
	{
		System.out.println("cons of AbsChildDemo1");
	}
	public static void main(String[] args)
	{
		AbsChildDemo1 ab1 = new AbsChildDemo1();
		ab1.funC();
		
	}

	@Override
	void funA() 
	{
		
	}

	@Override
	void funB() 
	{
		
	}
	
	
	
	}
