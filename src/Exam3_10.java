class Date1
{
	int year,month,day;
	void setDate(int i,int j,int k)
	{

		year=i;
		month=j;
		day=k;
	}
	void printDate()
	{

		System.out.println("year="+year+",month="+month+",day"+day);
	}
	
}

public class Exam3_10 {
	String name=new String();
	Date1 birthday=new Date1();
	void setperson(String s,int i,int j,int k)
	{
		name=s;
		birthday.setDate(i, j, k);
		
	}
	void printPerson()
	{

		System.out.println("name="+name+"\t");
		birthday.printDate();
	}
	public static void main (String args[])
	{

		Exam3_10 p=new Exam3_10();
		p.setperson("zhang ping",1973,10,23);
		p.printPerson();
	}

}
