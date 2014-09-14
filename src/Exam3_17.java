class A2
{
	String a="class A";
}
class B2 extends A2
{
	String b="class B";
}
public class Exam3_17 {
	public static void main(String args[])
	{

		A2 a1,a2=new A2();
		B2 b1,b2=new B2();
		a1=b2;
		b1=(B2)a1;
		System.out.println(a1.a);
		System.out.println(b1.b);
		a1=(A2)b2;
		System.out.println(a1.a);
		//b1=(B2)a2;
		//System.out.println(b1.b);
	}

}
