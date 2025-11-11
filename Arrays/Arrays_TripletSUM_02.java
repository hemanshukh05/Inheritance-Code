/*

2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)

*/

import java.util.Scanner;

public class Arrays_TripletsZero_02
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{-1,0,1,2,-1,-4};
	
		int k=3;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=(a.length-k);i++)
		{
		    System.out.print("[ ");
		    int sum=0;
			for(int j=i;j<=i+2;j++)
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