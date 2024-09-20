
public class ObjectDemo1A
{
 int x,y;
 
 void fun1()
 {
	 x=x+1;
	 A a1=new A();
	 a1.i=9;
 }
	public static void main(String[] args)
	{
		ObjectDemo1A d1 = new ObjectDemo1A();
		d1.fun1();
		A a1=new A();
		System.out.println(a1.i);
		
	}

}
