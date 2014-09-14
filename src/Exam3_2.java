class var
{

	static int a;
	int b;
	public void intprint()
	{
	
		int c=0;
		++a;
		++b;
		++c;
		System.out.print("a="+a);
		System.out.print(" b="+b);
		System.out.println(" c="+c);
	}
	public void allprint()
	{

		intprint();
		intprint();
	}
}
public class Exam3_2 {
	public static void main(String args[])
	{
		var v1=new var();
		var v2=new var();
		v1.allprint();
		v2.allprint();
	}

}
