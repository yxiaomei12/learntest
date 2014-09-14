
public class Exam3_6 {
	private int year,month,day;
	Exam3_6()
	{

		year=2000;
		month=1;
		day=1;
	}
	Exam3_6(int a,int b,int c)
	{

		year=a;
		month=b;
		day=c;
	}
	Exam3_6(Exam3_6 d)
	{

		year=d.year;
		month=d.month;
		day=d.day;
	}
	public void outDate()
	{

		System.out.print(year+"/"+month+"/"+day);
	}
	public Exam3_6 tomorrow()
	{

		Exam3_6 d=new Exam3_6(this);
		d.day++;
		if(d.day>d.daysInMonth())
		{

			d.day=1;
			d.month++;
			if(d.month>12)
			{

				d.month=1;
				d.year++;
			}
		}
		return d;
	}
	public int daysInMonth()
	{

		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
		case 4:case 6:case 9:case 11:
			return 30;
			default:
				if(year%4==0&&year%100!=0||year%400==0)
					return 29;
				else
					return 28;
		}
			
	}
	public static void main(String args[])
	{

		Exam3_6 d1=new Exam3_6();
		System.out.print("The current date is (year/month/day):");
		d1.outDate();
		System.out.println();
		System.out.print("Its tomorrow is (year/mongth/day):");
		d1.tomorrow().outDate();
		System.out.println();
		Exam3_6 dd=new Exam3_6(2004,1,8);
		System.out.print("The current date is (year/mongth/day)");
		dd.outDate();
		System.out.println();
		System.out.print("Its tomorrow is (year/mongth/day):");
		dd.tomorrow().outDate();
		System.out.println();
		
		
		
		
	}
	

}
