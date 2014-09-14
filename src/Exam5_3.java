import java.awt.*;
import java.applet.*;
public class Exam5_3 extends Applet{
	Label lab1,lab2;
	TextField text1,text2;
	public void init()
	{

		lab1=new Label("输入姓名");
		lab2=new Label("输入年龄");
		lab1.setBackground(Color.red);
		lab2.setBackground(Color.green);
		text1=new TextField("xingming",10);
		text2=new TextField(10);
		add(lab1); add(text1);
		add(lab2); add(text2);
	}
}
