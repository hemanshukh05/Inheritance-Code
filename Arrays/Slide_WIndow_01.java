// Q01..........Maximum Sum Subarray of Size K
//Find the maximum sum of a subarray with size k.


import java.util.*;

public class Slide_WIndow_01
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		
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
		
		int k=3;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		int max=Integer.MIN_VALUE;
		System.out.println("\n"+sum);
		for(int i=k;i<a.length;i++)
		{
			sum=sum+a[i]-a[i-k];
			System.out.println(sum);
			if(sum>max)
			{
				max=sum;
			}	
		}
		System.out.println("Maximum Sum : "+max);
	}
}