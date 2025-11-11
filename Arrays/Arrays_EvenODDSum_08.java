// Q8. Write a java program to calculate the sum of even or odd numbers.

import java.util.Scanner;

public class Arrays_EvenODDSum_08
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{11,25,10,45,46,50};
		

	    System.out.println("Sum of elements in Array");
		
		int esum=0,osum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				esum=esum+a[i];
			else 
				osum=osum+a[i];
		}
		System.out.println("Sum of even elements in Array = "+esum);
		System.out.println("Sum of odd elements in Array = "+osum);
		
		
	
	}
	
}