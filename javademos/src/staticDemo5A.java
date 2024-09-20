
public class staticDemo5A
{
 int a = funA();
 static int b = funB();
	public static void main(String[] args) 
	{
      System.out.println("main method of staticDemo5");
      System.out.println(b);
      
      staticDemo5A s1 = new staticDemo5A();
      s1.funA();
      System.out.println(s1.a);
      System.out.println("Done");
      
	}
  int funA()
  {
	  System.out.println("funA of staticDemo5A");
	  return 10;
  }
  static int funB()
  {
	  System.out.println("funB of staticDemo5A");
	  return 20;
  }
}
