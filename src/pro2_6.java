
public class pro2_6 {

	public static void main(String args[])
	{/*
		for(int a=1;a<34;a++)
			for(int b=1;b<21;b++)
			{

				if(3*a+5*b+(100-a-b)/3==100&&(100-a-b)%3==0)
					System.out.println("¹«¼¦="+a+",Ä¸¼¦"+b+",Ð¡¼¦"+(100-a-b));
			}
			*/

		for(int a=1;a<21;a++)
			for(int b=1;b<34;b++)
			{

				if(5*a+3*b+(100-a-b)/3==100&&(100-a-b)%3==0)
					System.out.println("¹«¼¦="+b+"Ä¸¼¦="+a+"Ð¡¼¦"+(100-a-b));
			}

	}
}
