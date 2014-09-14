
public class Exam3_4 {
	static double d;
	public static void main(String args[])
	{

		int i;
		Exam3_4 pt =new Exam3_4();
		i=5;
		pt.changeInt(i);
		System.out.println("int type value is :"+i);
		pt.d=6.25;
		pt.changeDouble(pt);
		System.out.println("double type value is :"+d);
		
	}
	public void changeInt(int v)
	{

		v=10;
	}
	public void changeDouble (Exam3_4 ref)
	{

		ref.d=10.5;
	}
	

}
