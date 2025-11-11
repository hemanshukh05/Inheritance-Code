//Q08........Find Max Average of Subarray of Size K
//Find the maximum average of any subarray of size k.


import java.util.*;
public class Slide_Window_08
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
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Subarray and Average");
		float avg=(float)sum/k;
		System.out.printf("{%d ,%d, %d} = %.2f",a[0],a[1],a[2],avg);

		float max=avg;
		
		for(int i=k;i<a.length;i++)
		{
			sum=sum+a[i]-a[i-k];
			avg=(float)sum/k;
			System.out.printf("\n{%d ,%d, %d} = %.2f",a[i-2],a[i-1],a[i],avg);
			if(avg>max)
			{
				max=avg;
			}
		}
		System.out.printf("\nMaximum Average of subarray of size %d is : %.2f",k,max);
		
	}
}