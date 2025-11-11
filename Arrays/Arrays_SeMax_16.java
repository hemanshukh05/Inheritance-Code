/*

Q16. Write a java program to find second highest value of array.
Input : 10 30 50 20 40
Output : 40

*/


import java.util.Scanner;

public class Arrays_SeMax_16
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{10,20,30,40,50};
		
		int max=a[0];
		int smax=Integer.MIN_VALUE;
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{ 
				smax=a[i];
		    }
		}
		System.out.println("Second max element in Array is = "+smax);
	}	
}














/*
 if(smax!=Integer.MIN_VALUE)
	   {
	       System.out.println("Second Max value is  "+smax);
	   }
	   else{
		    System.out.println("There is no seconod max value");
	   }
*/