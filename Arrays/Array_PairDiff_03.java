/*

3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)

*/

import java.util.Scanner;

public class Array_PairDiff_03
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{1, 5, 3, 4, 2};
	
		int k=2;
	    int value=2;
		for(int i=0;i<=(a.length-k);i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]-a[j]==value || a[j]-a[i]==value )
				{
				System.out.print("("+a[i]+" ,"+a[j]+")");
				}
			}
		}
	}
}
