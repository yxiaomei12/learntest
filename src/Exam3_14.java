class E
{

	public int a1=5;
	public int a2=4;
	protected int a3=3;
	int a4=2;
	int geta4()
	{
		return a4;
	}
}
class F extends E
{
	int b1=1;
	int sum()
	{

		return b1+a1+a2+a3+geta4();
	}

}
public class Exam3_14 {
	public static void main(String args[])
	{

		E a=new F();
		F b=new F();
		int sumA=a.a1+a.a2+a.a3+a.geta4();
		int sumB=sumA+b.b1;
		System.out.println("A"+sumA);
		System.out.println("B:"+sumB+",B:"+b.sum());
	}

}
