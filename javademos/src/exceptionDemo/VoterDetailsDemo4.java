package exceptionDemo;

public class VoterDetailsDemo4
{
	public static void main(String[] args) throws VoterAgeException
	{
		voterAgeValidation(17);
	
	}
	
	public static void voterAgeValidation(int age) throws VoterAgeException
	{
		if(age>=18)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("age is not valid for vote");
			throw new VoterAgeException();
			//throw new ArithmeticException();
		}
		System.out.println("continue....");
	}
	
	
	
	
	
	
	
	
	
}
