
public class Odemo10B 
{
  A getA (int x)
  {
	  A a1 = new A();
	  a1.i = x;
	  a1.j = x+1;
	  return a1;
  }
	public static void main(String[] args)
	{
		Odemo10B d1 = new Odemo10B();
		A y = d1.getA(6);
		A a1 = d1.getA(6).i;
		int a = d1.getA(6).i;
		A a1 = d1.getA(7).funA();
		int j = d1.getA(7).funA();
	}

}
