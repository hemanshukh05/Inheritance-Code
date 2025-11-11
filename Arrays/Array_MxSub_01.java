/*

1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])


*/

import java.util.Scanner;

public class Array_MxSub_01
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
	
		int k=4;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=(a.length-k);i++)
		{
		    System.out.print("[ ");
		    int sum=0;
			for(int j=i;j<=i+3;j++)
			{
				System.out.print(a[j]+"  ");
				sum=sum+a[j];
			}
	        System.out.print("]");
		System.out.println("= "+sum);

        if(sum>max)
			max=sum;
		}
		System.out.println("Maximum sum of subarray = "+max );
	}
}
