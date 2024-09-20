
public class ObjectDemo2 
{
	int x,y;
	void fun1()
	{
		x=x+1;
		System.out.println(x);
		ObjectDemo2 d1=new ObjectDemo2();
		d1.x=x+2;
		System.out.println(d1.x);
	}

	public static void main(String[] args)
	{
		ObjectDemo2 d1=new ObjectDemo2();
		d1.fun1();
		System.out.println(d1.x);
	}

}
