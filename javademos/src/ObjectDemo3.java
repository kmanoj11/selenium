
public class ObjectDemo3 
{
	
  int x = 3;
  A a1 = new A();
    public static void main(String[] args)
	{
		ObjectDemo3 d1=new ObjectDemo3();
		System.out.println(d1.x);
		System.out.println(d1.a1);
		System.out.println(d1.a1.i);
		d1.a1.funA();
	}
}
