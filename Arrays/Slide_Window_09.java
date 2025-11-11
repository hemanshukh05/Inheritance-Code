//Q09............Number of Subarrays of Size K with Average Greater Than Threshold
// Count how many subarrays of size k have an average greater than a given threshold.


import java.util.*;
public class Slide_Window_09
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter sub Array size");
		int k=sc.nextInt();
		
		System.out.println("Enter Threshold Value");
		int val=sc.nextInt();
		
		int sum=0,count=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Subarray and Average");
		float avg=(float)sum/k;
		System.out.printf("{%d ,%d, %d} = %.2f",a[0],a[1],a[2],avg);
		if(avg>val)
		{
			count++;
		}
		for(int i=k;i<a.length;i++)
		{
			sum=sum+a[i]-a[i-k];
			avg=(float)sum/k;
			System.out.printf("\n{%d ,%d, %d} = %.2f",a[i-2],a[i-1],a[i],avg);
			if(avg>val)
			{
				count++;
			}
		}
		System.out.printf("\nSubarrays of size %d have Average greater than threshold = %d",k,count);
		
	}
}