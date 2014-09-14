
class S1
{
	double r;
	S1 (double i)
	{

		r=i;
	}
}
class subS extends S1
{
	subS(double i)
	{

		super(i);
	}
	double area()
	{
		double area=3.14*r*r;
		return area;
	}
	
}
public class you3_2 {
	public static void main(String args[])
	{
	subS s1=new subS(10);
	
	System.out.println(s1.area());
	}
	

}
