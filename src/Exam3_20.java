abstract class S
{
	abstract void print();
}
class R extends S
{
	void print()
	{

		System.out.println("class S");
	}

}
class M extends S
{
	void print()
	{

		System.out.println("class M");
	}

}
class T extends S
{
	void print()
	{

		System.out.println("class T");
	}

}
public class Exam3_20 {
	static void method1(S s)
	{

		s.print();
	}
	public static void main(String args[])
	{

		R r=new R();
		M c=new M();
		T t=new T();
		method1(r);
		method1(c);
		method1(t);
	}

}
