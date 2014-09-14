import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Exam5_2 extends Applet implements ActionListener,MouseListener{
	private Button But;
	String str;
	String mouseClickCnt="����";
	Dimension CurrentPos=new Dimension();
	int clickCnt=0;
	public void init()
	{

		But=new Button("��ť");
		setLayout(new FlowLayout());
		add(But);
		But.addActionListener(this);
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{

		str=new String("������"+clickCnt+"�ΰ�ť");
		g.drawString(str, 10, 40);
		g.drawString("���"+mouseClickCnt+"λ��:("+CurrentPos.width+","+CurrentPos.height+")",10,70);
	}
	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource()==But)
		{

			clickCnt++;
			repaint();
		}
	}
	public void mouseClicked(MouseEvent e)
	{

		CurrentPos.width=e.getX();
		CurrentPos.height=e.getY();
		if(e.getClickCount()==1)
			mouseClickCnt="����";
		else
			mouseClickCnt="˫��";
		repaint();
		
	}
	public void mousePressed(MouseEvent e)
	{}
	public void mouseReleased(MouseEvent e)
	{}
	public void mouseEntered(MouseEvent e)
	{}
	public void mouseExited(MouseEvent e)
	{}
}
