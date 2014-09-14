
public class Exam2_22 {
	public static void main(String args[])
	{

		int IntArry1[]=new int[3];
		int IntArry2[]={3,5,7,9};
		int IntArry3[];
		IntArry1[0]=10;
		IntArry1[1]=20;
		ArryPrint("IntArry1",IntArry1);
		ArryPrint("IntArry2",IntArry2);
		IntArry3=IntArry2;
		IntArry3[2]=8;
		ArryPrint("IntArry3",IntArry3);
		System.out.println("IntArry2:  ");
		for(int i=0;i<IntArry2.length;i++)
			System.out.print(IntArry2[i]+"\t");
		
		
	}
	public static void ArryPrint(String str,int a[])
	{
		System.out.println(str+":  ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
	}

}
//数组IntArry3被数组IntArry2复制，这是数组IntArry3和数组IntArry2公用一个存储空间，因此，改变了IntArry3某个元素值，而数组IntArry2相应元素也被改变