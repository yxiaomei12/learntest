import java.io.*;

public class Exer1_3 {
	public static void main(String args[])
	{
		String str=" ";
		System.out.println("Input a string:");
		try{

			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			str=in.readLine();
		}
		catch(IOException e)
		{}
		System.out.println("The string is \" "+str+"\" ");
		
	}
}
