/*

7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3

*/



import java.util.Scanner;

public class Array_Intersection_07
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[]{1,2,3};
		int arr2[]=new int[]{2,3,4};
	
		System.out.println("Common elements in two arrays");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]+" ");
			}
		}
		
	}
}
