
public class ConsDemo9 
{
  int a= 10;
  ConsDemo9(int i)
  {
	  System.out.println("cons of ConsDemo9");
	  System.out.println(i);
	  a=i;
  }
	public static void main(String[] args)
	{
		ConsDemo9 c1 = new ConsDemo9(15);
		System.out.println(c1.a);
		
		ConsDemo9 c2 = new ConsDemo9(20);
		System.out.println(c2.a);
	}

}
