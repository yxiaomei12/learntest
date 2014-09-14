import java.io.*;
public class Exer1_2 {
	public static void main(String args[])
	{
      char ch=' ';
      System.out.println("Input a character:");
      try{
    	  ch=(char)System.in.read();
      }
      catch(IOException e)
      {}
      System.out.println("The character is:\'"+ch+"\'");
	}

}
