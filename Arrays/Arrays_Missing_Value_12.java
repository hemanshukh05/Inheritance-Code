/*
Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14

*/


import java.util.Scanner;

public class Arrays_Missing_Value_12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[15];                //1 4 6 7 11  15
		
	    System.out.println("Enter array elements");
		for(int i=0;i<a.length-9;i++)
		{
			a[i]=sc.nextInt();
		}
		
	    System.out.println("Arrays missing element");
		for(int i=1;i<=a.length;i++)
		{
		    boolean flag=true;
			for(int j=0;j<a.length-9;j++)
			{
				 
				if(i==a[j])
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
			{
				System.out.println(i);
			}
		}
	}
}