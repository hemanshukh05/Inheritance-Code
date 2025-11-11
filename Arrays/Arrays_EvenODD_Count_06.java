/*

6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3

*/


import java.util.Scanner;

public class Arrays_EvenODD_Count_06
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{1, 2, 3, 4, 5, 6};
		

	    System.out.println("Elements in Array");
		
		int evenco=0,oddco=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				evenco++;
			else 
				oddco++;
		}
		System.out.println("Even element= "+evenco+"   Odd Elements= "+oddco);
	
	}
	
}