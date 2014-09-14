
abstract class B
{


	void outB()
	{

		System.out.println("in B");
	}
	abstract void method1();
}
class C extends B
{
	void method1()
	{

		System.out.println("in C");
	}

}
public class Exam3_8 {
	public static void main(String args[])
	{

		B b=new C();
		b.method1();
		b.outB();
	}

}
