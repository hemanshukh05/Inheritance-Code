//Q2.......Minimum Sum Subarray of Size K
//Find the minimum sum of a subarray with size k.


import java.util.*;

public class Slide_WIndow_02
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
		int min=Integer.MAX_VALUE;
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		if(sum<min)
		{
			min=sum;
		}
	
		for(int i=k;i<a.length;i++)
		{
			sum=sum+a[i]-a[i-k];
	
			if(sum<min)
			{
				min=sum;
			}
			
		}
		System.out.println("\nMinimum Sum : "+min);
	}
}