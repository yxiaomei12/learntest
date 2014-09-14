import java.applet.Applet;
import java.awt.Graphics;
public class Exam4_1 extends Applet{
	String str;
	public void init()
	{
		str="Here is an Applet.";
	}
	public void paint(Graphics g)
	{

		g.drawString(str,100,100);
	}
	

}
