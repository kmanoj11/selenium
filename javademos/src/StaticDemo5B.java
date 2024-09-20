
public class StaticDemo5B
{
  int a = funA();
	public static void main(String[] args)
	{
     System.out.println("main method of StaticDemo5B");
     new StaticDemo5B();
     new StaticDemo5B();
     new StaticDemo5B();
     System.out.println("Done");
	}
	static int funA()
	{
		System.out.println("funA of StaticDemo5B");
		return 10;
	}

}
