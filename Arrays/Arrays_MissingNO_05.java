/*
5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3

*/

import java.util.Scanner;

public class Arrays_MissingNO_05
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a[]=new int[n];  
	
		
	    System.out.println("Enter array elements");
		for(int i=0;i<n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=1;i<=n;i++)
		{
		    boolean flag=true;
			for(int j=0;j<n-1;j++)
			{
				 
				if(i==a[j])
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
			{
				System.out.println("Missing number from 1 to N in array = "+i);
			}
		}
	}
}