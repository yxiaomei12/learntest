
public class Exam2_16 {
	public static void main(String args[])
	{

		int n=1;
		for(int i=1;i<10000;i++)
		{

			int sum=0;
			for(int j=1;j<i;j++)
				if(i%j==0)
					sum+=j;
			if(sum==i)
			{	
				System.out.print(i+String.valueOf('\t'));
			n++;
			if(n%3==0)
				System.out.println();
			}
		}
	}

}
