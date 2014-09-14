import java.applet.Applet;
import java.awt.*;
public class Exam4_11 extends Applet {
	public void paint(Graphics g)
	{

		int x0=30,y0=35,W=400,H=120;
		g.setColor(Color.green);
		g.drawOval(x0, y0, W,H);
		g.setColor(Color.blue);
		for(int i=0;i<9;i++)
		{

			g.drawOval(x0-i*1, y0-i*1, W+i*2, H+i*2);
			
		}
		///g.setColor(new Color(200,50,100));
		//g.setFont(new Font ("Helvetica",Font.BOLD,45));
		//g.drawString("HELLO BEIJING!",45,110);
	}

}
