interface Series
{
	int getVal();
}
class R1 implements Series
{

	int val;
	R1()
	{
	
	val=0;
	}
	public int getVal()
	{

		val++;
		return val;
	}
}
class R2 implements Series
{

	int val;
	R2()
	{
		val=0;
	}
	public int getVal()
	{

		val+=2;
		return val;
	}
}

public class Exer3_10 {
	public static void main(String args[])
	{

		R1 r1=new R1();
		R2 r2=new R2();
		Series s;
		for(int i=0;i<3;i++)
		{

			s=r1;
			System.out.println("r1 "+s.getVal());
			s=r2;
			System.out.println("r2 "+s.getVal());
		}
	}

}
