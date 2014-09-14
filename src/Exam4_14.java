import java.applet.Applet;
import java.awt.*;
public class Exam4_14 extends Applet{
	Image[] Im;
	int totalno=5;
	int currentno=0;
	public void init()
	{

		Im=new Image[totalno];
		for(int i=0;i<Im.length;i++)
		{

			Im[i]=getImage(getDocumentBase(),"C00"+(i+1)+".jpg");
		}
		
	}
	public void paint(Graphics g)
	{

		g.drawImage(Im[currentno],20,20,250,250,this);
		currentno=++currentno%totalno;
		try
		{

			Thread.sleep(800);
			
		}catch(InterruptedException e){}
		repaint();
	}

}
