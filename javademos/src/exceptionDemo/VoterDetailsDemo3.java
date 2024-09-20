package exceptionDemo;

import java.io.IOException;

public class VoterDetailsDemo3
{
	public static void main(String[] args) throws IOException
	{
		//voterAgeValidation(18);
		voterAgeValidation(17);
	
	}
	
	public static void voterAgeValidation(int age) throws IOException
	{
		if(age>=18)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("age is not valid for vote");
			throw new IOException();
		}
		System.out.println("continue....");
	}
	
	
	
	
	
	
	
	
	
}
