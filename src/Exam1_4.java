import java.awt.*;
import java.awt.event.*;
public class Exam1_4 {
	public static void main(String args[])
	{
		ApplicationFrame AF=new ApplicationFrame();
		
		
	}
}
class ApplicationFrame extends Frame implements ActionListener
{
	Label prompt;
	TextField text1,text2;
	Button btn;
	int a=0,b=0;
	ApplicationFrame()
	{
		super("�ҵĴ���");
		prompt=new Label("��������������:");
		text1=new TextField(4);
		text2=new TextField(4);
		btn=new Button("����");
		setLayout(new FlowLayout());
		add(prompt);
		add(text1);
		add(text2);
		add(btn);
		btn.addActionListener(this);
		show();
	}
	public void actionPerformed(ActionEvent e)
	{
		a=Integer.parseInt(text1.getText());
		b=Integer.parseInt(text2.getText());
	}
	public void paint (Graphics g)
	{
		g.drawString("��������"+a+"*"+b+"="+a*b,20,80);
	}
}