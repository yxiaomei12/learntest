import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Exam5_1 extends Applet implements ActionListener{
	private Button But1,But2;
	int button=0;
	public void init()
	{

		But1=new Button("��ť1");
		But2=new Button("��ť2");
		add(But1);
		add(But2);
		But1.addActionListener(this);
		But2.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		if(button==1)
			g.drawString("���˰�ť1",10,20);
		else
			g.drawString("���˰�ť2",10,20);
	}
	public void actionPerformed(ActionEvent e)
	{

		if(e.getActionCommand().equals("��ť1"))
			button=1;
		else if(e.getActionCommand().equals("��ť2"))
		    button=2;
		repaint();
	}

}
