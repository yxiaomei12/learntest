class SB
{
	static int a,b;
	//��̬��ʼ�����������ʼ����̬�����ģ������ڴ�������֮ǰ��ִ�еġ�
	static 
	{

		System.out.println("In static block.");
		a=5;
		b=8;
	}
	SB(String str)
	{
		System.out.println(str);
	}
	static int Print()
	{

		return a+b;
	}
	
}
public class you3_4 {
	public static void main(String args[])
	{

	
		SB sb=new SB("Buid aobject");
		System.out.println("a+b="+SB.Print());
	}

}
