// Q23. Write a java program to find armstrong number of a array. 


import java.util.Scanner;

public class Array_Armstrong_23
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{153,370,45,50,90};
		
		System.out.println("Armstrong Number in Array");
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=a[i];j>0;j=j/10)
			{
				count++;
			}
			int sum=0;
			for(int k=a[i];k>0;k=k/10)
			{
				int rem=k%10;
				sum=sum+(int)Math.pow(rem,count);	
			}
			if(sum==a[i])
				System.out.println(a[i]);
			
		}
		
	}
}
