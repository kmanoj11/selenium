
public class ConsDemo11 
{
	 int a = 10;
	 int b = 15;
	 ConsDemo11(int a,int b)
	 {
		 a=a;
		 b=b;
	 }

	public static void main(String[] args) 
{
		System.out.println("main method of ConsDemo11");
		ConsDemo11 c1 = new ConsDemo11(20,30);
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println("done");
	}

}
