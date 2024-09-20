
public class ODemo6a 
{
 int x=4;
// A a1=new A();
 ODemo6a d1;
	public static void main(String[] args) 
	{
      System.out.println("main method of ODemo6a");
      ODemo6a d1 = new ODemo6a();
      System.out.println(d1.x);
      System.out.println(d1.d1);
      d1.d1 = new ODemo6a();
      d1.d1.d1 = new ODemo6a();
      int x = 6;
      d1.d1.d1.x = x;
      d1.d1.d1.d1 = d1;
      d1.d1.d1.d1.x = 13;
      System.out.println(d1);
      System.out.println(d1.x);
	}

}
