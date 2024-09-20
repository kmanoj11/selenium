package interfaceDemo;

public class CanadaBank implements Bank
{

	public static void main(String[] args) 
	{
  
	}

	@Override
	public void totalCustomers() 
	{
		System.out.println("totalCustomers of CanadaBank");
	}

	@Override
	public void totalBalance()
	{
		System.out.println("totalBalance of CanadaBank");		 
	}

}
