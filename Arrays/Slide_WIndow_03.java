

//🔹 Section B: Sliding Window Technique (10 Questions)

// Q03....................Check if Subarray with Given Sum Exists
//For a given sum, check if there’s a subarray with that sum using sliding window.



import java.util.*;

public class Slide_WIndow_03
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		
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
		
		
		System.out.println("\nEnter targer Sum");
		int target=sc.nextInt();
		int k=2;
		int sum=0;
		
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		if(sum==target)
		{
			System.out.printf("{%d, %d}\t",a[0],a[1]);
		}
	
		for(int i=k;i<a.length;i++)
		{
			sum=sum+a[i]-a[i-k];
	
			if(sum==target)
			{
				System.out.printf("{%d, %d,}\t",a[i-1],a[i]);
			}
			
		}
	}
}


