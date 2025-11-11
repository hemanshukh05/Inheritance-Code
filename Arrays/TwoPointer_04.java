//Q4...............Merge Two Sorted Arrays (No Extra Space)
//Merge two sorted arrays in-place using the two-pointer method.


import java.util.Scanner;

public class TwoPointer_04
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		
		System.out.println("Enter elements in 1st array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array"); 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nEnter elements in 2nd array");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Display Array"); 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		int c[]=new int [a.length+b.length];
		
		for(int i=0,j=i+a.length;i<a.length;i++,j++)
		{
			c[i]=a[i];
			c[j]=b[i];
		}
		System.out.println("\nDisplay Merge Array"); 
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
			
	}
}