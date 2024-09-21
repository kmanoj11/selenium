package cucumberHooksDemo1;

public class CucumberHooksDemo1 
{ 
	@be
	public void beforeSenario()
	{
		System.out.println("beforeSenario of CucumberHooksDemo1");
	}
	public void afterSenario()
	{
		System.out.println("afterSenario of CucumberHooksDemo1");
	}
}
