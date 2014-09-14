import java.applet.Applet;
import java.awt.*;

public class Exam4_7 extends Applet{
	public void paint(Graphics g)
	{

		int x1,y1,dx=15,dy=20,x0=10,y0=10,N=15,M=5,y2,x2;
		x1=x0;
		y1=y0;
		//x2=x1+dx*M;
		y2=y1+dy*M;
		for(int i=0;i<=N;i++)
		{

			x1=x0+i*dx;
			g.drawLine(x1, y1, x1, y2);
		}
		g.setColor(Color.red);
		x1=x0;x2=x0+N*dx;
		for(int j=0;j<=M;j++)
		{
			y1=y0+j*dy;
			g.drawLine(x1,y1,x2,y1);
		}
		
	}

}
