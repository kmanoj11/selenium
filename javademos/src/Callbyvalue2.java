
public class Callbyvalue2 
{
int data = 50;
void change(int data)
{
	data = data+100;
}
	public static void main(String[] args) 
	{
		Callbyvalue2 op = new Callbyvalue2();
		
		System.out.println("before change"+op.data);
		op.change(500);
		System.out.println("after change"+op.data);

	}
	}


