
public class Odemo8C 
{
 void fun1 (A a1)
 {
	 System.out.println(a1);
	 if (a1!=null)
	 {
		 a1.i = a1.i+1;;
		 a1.j = a1.j+2;
	 }
	 System.out.println("end of fun1");
	 System.out.println(a1.i);
	 System.out.println(a1.j);
 }
	public static void main(String[] args) 
	{
		Odemo8C d1 = new Odemo8C();
		A a1 = new A();
		d1.fun1(a1);
		d1.fun1(a1);
		d1.fun1(new A());
		d1.fun1(null);
	}

}
