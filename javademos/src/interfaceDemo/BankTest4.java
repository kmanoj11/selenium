package interfaceDemo;

public class BankTest4 
{
	Bank b1;
	public static void main(String[] args) 
	{
		BankTest4 bank = new BankTest4();
		bank.bankDetails("Canada");
	}
	void bankDetails(String bankName)
	{
		if (bankName.equals("US"))
		{
			b1 = new USBank();
		}
		else if (bankName.equals("UK"))
		{
			b1 = new UKBank();
		}
		else if (bankName.equals("Canada"))
		{
			b1 = new CanadaBank();
		}
	}
}
