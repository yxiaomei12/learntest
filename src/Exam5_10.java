import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Exam5_10 extends Applet implements KeyListener,MouseListener{
	myCanvas cv;
	TextField text;
	String str=" ";
	public void init()
	{

		cv=new myCanvas();
		cv.addKeyListener(this);
		cv.addMouseListener(this);
		text=new TextField(10);
		add(text);
		add(cv);
	}
	public void keyTyped(KeyEvent e)
	{
       text.setText("KeyTyped");
       str+=e.getKeyChar();
       cv.getGraphics().drawString(str,10,20);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		text.setText("MouseClicked");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		text.setText("MouseEntered");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		text.setText("MouseExited");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		text.setText("MouseRleased");
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		text.setText("KeyPressed");
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		text.setText("KeyReleased");
		
	}
}
class myCanvas extends Canvas
{
	public myCanvas()
	{
		setSize(new Dimension(100,100));
		setBackground(Color.pink);
	}
	
}


