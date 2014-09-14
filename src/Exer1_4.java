
public class Exer1_4 {
	
	public static void main(String args[])
	{

		A a=new A();
		a.i=8;
		a.d=1.25;
		a.meth("该程序输出结果如下所示：");
		System.out.println("\ti="+a.i+",d="+a.d);
	}

}
class A
{

	int i;
	double d;
	void meth(String str)
	{

		System.out.println(str);
	}
}