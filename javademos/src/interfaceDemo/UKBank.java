package interfaceDemo;

public class UKBank implements Bank
{

	public static void main(String[] args) 
	{
		
	}

	@Override
	public void totalCustomers() 
	{
		System.out.println("totalCustomers of UKBank");

	}

	@Override
	public void totalBalance() 
	{
		System.out.println("totalBalance of UKBank");

	}

}
