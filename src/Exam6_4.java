
public class Exam6_4 {
	public static void main(String args[])
	{
		fun(0);
		fun(1);
		fun(2);
		fun(3);
		
	}
	static void fun(int i)
	{

		System.out.println("���÷���"+i);
		try{
			if( i==0)
			{

				System.out.println("û���쳣");
			}
			else if(i==1)
			{

				int a=0;
				int b=10;
				b/=a;
			}
			else if(i==2)
			{

				int m[]=new int[5];
				m[5]=100;
			}
			else if(i==3)
			{

				String str ="56k9";
				int n=Integer.parseInt(str);
			}
		}
		catch(Exception e)
		{
			System.out.println("��׽�쳣"+e);
		}
	}
	
}
