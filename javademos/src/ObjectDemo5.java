
public class ObjectDemo5 
{
 int x=1;
 A a1 = new A();
 void fun1()
 {
	 x = x+1;
	 a1.i = a1.i+x;
 }
	public static void main(String[] args)
	{
		ObjectDemo5 d1 = new ObjectDemo5();
		d1.x = d1.x+2;
		d1.a1.i = d1.a1.i+1;
		d1.fun1();
		System.out.println(d1.a1.i);
		System.out.println(d1.x);
		
	}

}
