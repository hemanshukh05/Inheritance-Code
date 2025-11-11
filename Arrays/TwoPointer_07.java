//Q07............Reverse an Array In-Place
//Reverse an array using the two-pointer technique.


import java.util.*;

public class TwoPointer_07
{
    public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		
		System.out.println("Enter Elements in Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nReverse of Array");
		for(int i=0,j=a.length-1;i<=j;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}
}