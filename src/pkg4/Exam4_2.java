package pkg4;
import java.applet.Applet;
import java.awt.*;

class A
{
	double fun(double i,double j)
	{

		return i+j;
	}
}
class P extends A
{
	double fun(double i,double j)
	{

		return i*j;
	}
}

public class Exam4_2 extends Applet {
	P product;
	public void init()
	{

		product=new P();
	}
	public void paint(Graphics g)
	{

		g.drawString("product="+product.fun(3,8),100,100);
	}

}
