class A3
{
	int a;
	A3(int i)
	{

		a=i;
	}
}
class B3 extends A3
{
	int a,b;
	B3(int i,int j)
	{
		super(i);
		b=j;
		a=i+j;
		
	}
	
}
public class AB {
	public static void main(String args[])
	{
		A3 a1=new A3(9),a2;
		B3 b=new B3(3,5);
		System.out.println(b.a);
		a2=a1;
		System.out.println(a2.a);
		//b(3,8,5)��һ��������A2��a��ֵ���ڶ���������B2��a��ֵ��������������B2��b��ֵ
		a2=b;
		System.out.println(a2.a);
		b=(B3)a2;
		System.out.println(b.a);
		
	}

}
