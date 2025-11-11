//Q20. Write a java program to find perfect number of a array.



import java.util.Scanner;

public class Array_Perfect_20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{6,7,9,28,30};
		
		System.out.println("Perfect Number in Array");
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			int sum=0;
			for(int j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==a[i])
			{
				System.out.println(a[i]);
			}
		}
		
	}
}