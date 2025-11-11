//Q4..........Find First Negative Number in Every Window of Size K
//For each window of size k, find the first negative number.



import java.util.*;

public class Slide_WIndow_04
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[9];         		//-1 2 -2 4 -5 -4 3 -2 -3
		
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		System.out.println("\nEnter Window Size");
		int k=sc.nextInt();
		
		System.out.println("First negative number in window");
		
		for(int i=0;i<a.length-k;i++)
		{
			System.out.printf("{%d, %d, %d} = ",a[i],a[i+1],a[i+2]);
			for(int j=i;j<i+k;j++)
			if(a[j]<0)
			{
				System.out.println(a[j]);
				break;
			}
		}
	 
	}
}

 