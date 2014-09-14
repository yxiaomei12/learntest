import java.applet.Applet;
import java.awt.*;

public class Exam4_3 extends Applet{
	String str;
	int x,y,h;
	Font fnt;
	public void init()
	{

		str="Hello,beijing";
		h=Integer.parseInt("30");
		x=Integer.parseInt("50");
		y=Integer.parseInt("100");
		fnt=new Font("TimesRoman",Font.BOLD,h);
	}
	public void paint(Graphics g)
	{
		Color c1=g.getColor();

		g.setColor(Color.red);
		g.setFont(fnt);
		g.drawString(str, 20, 30);
		g.setColor(c1);
		g.setFont(fnt);
		g.drawString(str, x, y);
		
	}
	

}
