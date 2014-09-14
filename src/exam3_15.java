 class A1
{

	int a1=2;
	public int a2=4;
	public int a3=6;
	int geta3()
	{
	
	return a3;
	}
	void seta3(int i)
	{

		a3=i;
	}
}
 class B1 extends A1
 {

	 int b1=3;
 }
 class C1 extends B1
 {
	 int c1=7;
	 void method1()
	 {

		 a1++;
		 a2++;
		 seta3(geta3()+1);
		 b1++;
		 c1++;
	 }
	 
 }
public class exam3_15 {
	public static void main(String args[])
	{
			C1 c=new C1();
			c.method1();
			System.out.println(c.a1+","+c.a2+","+c.geta3()+","+c.b1+","+c.c1);
		
	}
}
