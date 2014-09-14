
public class Exam2_19 {
	public static void main (String args[])
	{

		LOOP1:
			for(int i=1;i<100;i++)
			{
				for(int j=2;j<i;j++)
					if(i%j==0)
						continue LOOP1;
				System.out.println(i+" ");
			}
	}

}
