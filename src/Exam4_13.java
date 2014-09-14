import java.applet.Applet;
import java.awt.*;
public class Exam4_13 extends Applet{
	public void paint(Graphics g)
	{

		Image pic;
		//System.out.println(getDocumentBase());
		pic=getImage(getDocumentBase(),"Z002.jpg");
		System.out.println(pic.getWidth(this));
		int x0=10,y0=30;
		int w=pic.getWidth(this);
		//System.out.println(pic.getWidth(this));
		//System.out.println(pic.getHeight(this));
		int h=pic.getHeight(this);
		g.drawImage(pic,x0,y0,w/8,h/8,this);
		g.drawImage(pic,x0+150,y0,w/12,h/12,this);
		g.drawImage(pic,x0+150,y0+100,w/15,h/15,this);
		g.drawImage(pic,x0+250,y0+30,(int)(w*0.1),(int)(h*0.2),this);
		
	}

}
