import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Exam5_5 extends Applet implements ActionListener,TextListener{
	TextArea ta1,ta2;
	TextField text1;
	public void init()
	{

		text1=new TextField("这是文本框",20);
		text1.addActionListener(this);
		text1.addTextListener(this);
		add(text1);
		ta1=new TextArea("这是文本区A",10,15);
		ta1.addTextListener(this);
		add(ta1);
		ta2=new TextArea("这是文本区B",6,20);
		add(ta2);
	}
	public void actionPerformed(ActionEvent e)
	{
		ta1.append("\n处理动作事件");
		repaint();
		
	}
	public void textValueChanged(TextEvent e)
	{
		ta2.append("\n处理文本改变事件");
		repaint();
	}

}
