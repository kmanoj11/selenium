
public class Callbyvalue3 
{
int data = 50;
void change(Callbyvalue3 op)
{
	op.data = op.data+100;
}
	public static void main(String[] args) 
	{
		Callbyvalue3 op = new Callbyvalue3();
		
		System.out.println("before change"+op.data);
		op.change(op);
		System.out.println("after change"+op.data);

	}

}
