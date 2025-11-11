//Q08............Find Intersection of Two Sorted Arrays
//Return the intersection of two sorted arrays using two pointers.


import java.util.*;

public class TwoPointer_08
{
    public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		
		System.out.println("Enter Elements in 1st Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter Elements in 2nd Array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println("\nIntersection of sorted arrays");
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i=0,j=0;
		while(i<a.length)
		{
			if(a[i]==b[j]){
				System.out.print(a[i]+" ");
			}
			j++;
			if(j==(b.length-1))
			{
				i++;
				j=0;
			}
		}

	}
}