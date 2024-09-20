package interfaceDemo;

public class USBank implements Bank
{

	public static void main(String[] args) 
	{

	}

	@Override
	public void totalCustomers()
	{
		System.out.println("totalCustomers of USBank");

	}

	@Override
	public void totalBalance() 
	{
		System.out.println("totalBalance of USBank");
		
	}

}
