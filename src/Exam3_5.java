
public class Exam3_5 {
	static int add(int i,int j)
	{

		return i+j;
	}
	static double add(double i,double j)
	{

		return i+j;
	}
	public static void main(String args[])
	{

		int i1=3,i2=5;
		char c1='a',c2='b';
		float f1=3.1f,f2=4.1f;
		double d1=2.5,d2=2.8;
		System.out.println(add(i1,i2));
		System.out.println(add(c1,i1));
		System.out.println(add(i1,f1));
		System.out.println(add(f1,d2));
		System.out.println(add(d1,i2));
	}
	

}
