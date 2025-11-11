//  Q22. Write a java program to find strong number of a array.

import java.util.Scanner;

import java.util.Scanner;

public class Arrays_StrongNO_22
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		
		System.out.println("Enter elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Strong Numbers in array");
		
		for(int i=0;i<a.length;i++)
		{ 
			int sum=0;
			for(int k=a[i];k>0;k=k/10)
			{
			    int fact=1;
				int rem=k%10;
				for(int j=rem;j>0;j--)
				{
					fact=fact*j;
				}
			    sum=sum+fact;
				if(sum==a[i])
					System.out.println(a[i]);
			}
		}
	}
}