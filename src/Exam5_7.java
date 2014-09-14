import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Exam5_7 extends Applet implements ItemListener{
	CheckboxGroup cg;
	Checkbox red,yellow,green,blue;
	Color co;
	List lc;
	String colorname[]={"��ɫ","��ɫ","��ɫ"," ��ɫ"," ��ɫ"," ��ɫ"," ��ɫ"};
	Color colors[]={Color.red, Color.yellow, Color.green, Color.blue, Color.orange, Color.black, Color.pink};
	int a;
	public void init()
	{

		cg=new CheckboxGroup();
		co=Color.red;
		red=new Checkbox("��ɫ",cg,true);
		red.addItemListener(this);
		add(red);
		yellow=new Checkbox("��ɫ",cg,false);
		yellow.addItemListener(this);
		add(yellow);
		green=new Checkbox("��ɫ",cg,false);
		green.addItemListener(this);
		add(green);
		blue=new Checkbox("��ɫ",cg,false);
		blue.addItemListener(this);
		add(blue);
		lc=new List(5,false);
		lc.addItemListener(this);
		for(int i=0;i<colorname.length;i++)
		{

			lc.add(colorname[i]);
			add(lc);
		}
	}
	public void itemStateChanged(ItemEvent e)
	{

		if(e.getSource()==red)co=Color.red;
		if(e.getSource()==yellow)co=Color.yellow;
		if(e.getSource()==green)co=Color.green;
		if(e.getSource()==blue)co=Color.blue;
		showStatus(lc.getSelectedItem()+":˳���"+lc.getSelectedIndex());
		a=lc.getSelectedIndex();
		repaint();
	}
	public void paint(Graphics g)
	{

		g.setColor(co);
		g.fillRect(50,80,50,50);
		g.setColor(colors[a]);
		g.fillOval(270,100,50,50);
	}

}
