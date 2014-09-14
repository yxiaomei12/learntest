
public class you3_1 {
	int a1,a2;
	you3_1(int i,int j)
	{

		a1=i;a2=j;
	}
	public void swap()
	{
		int t;
		t=a1;
		a1=a2;
		a2=t;
		
	}
	public static void main(String args[])
	{

		you3_1 s=new you3_1(3,5);
		s.swap();
		System.out.println("a1="+s.a1+" a2="+s.a2);
	}

}
