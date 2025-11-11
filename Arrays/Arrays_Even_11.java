/*


Q11. Print array elements at even indices.
Input: arr = [4, 9, 7, 11, 6]
Output: 4 7 6
Explanation: Even indices → 0, 2, 4 → elements 4, 7, 6.

*/

import java.util.Scanner;

public class Arrays_Even_11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display elements of array");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
	    System.out.println("\nArray elements at even indices");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				System.out.printf("%d\t",a[i]);
		}
	
	}
	
}