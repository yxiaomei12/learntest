
public class Exam2_20 {
	public static void Method1()
	{

		System.out.println("Method1.");
	}
	public static int Method2()
	{

		System.out.println("Method2.");
		return a+b;
	}
	static int a=5,b=8;
	public static void main(String args[])
	{

		Method1();
		int s=Method2();
		System.out.println("s="+s);
	}

}
