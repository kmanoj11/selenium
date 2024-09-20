
public class PolyDemo6A 
{

	public static void main(String[] args)
	{
		PolyDemo6A p1 = new PolyDemo6A();
		A a = null;
		p1.funA(a);
		B b = null;
		p1.funA(b);
		C c = null;
		p1.funA(c);
	}
	void funA(A a)
	 {
		 System.out.println("class A args of PolyDemo6");
		 System.out.println(a);
	 }
	 void funA(B b)
	 {
		 System.out.println("class B args of PolyDemo6");
		 System.out.println(b);
	 }
	 void funA(C c)
	 {
		 System.out.println("class C args of PolyDemo6");
		 System.out.println(c);
	 }
}