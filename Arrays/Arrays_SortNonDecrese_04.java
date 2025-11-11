/*

4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true

*/

import java.util.Scanner;

public class Arrays_SortNonDecrese_04
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{1, 2, 2, 3, 4};
		
		boolean flag=true;
		for(int i=1;i<a.length;i++)
		{ 
			if(a[i]<a[i-1])
			{
				flag=false;
			}
		}
		if(flag){
			System.out.println("Array is sorted in non-decreasing order");
		}
		else 
			System.out.println("Array is not sorted in non-decreasing order");
	
	}
}