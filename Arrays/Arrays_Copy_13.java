// Q13. Write a java program to copy one array to another array.

import java.util.Scanner;

public class Arrays_Copy_13
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{5,6,7,8,9,10};
		//int b[]=new int[a.length];
		
		int b[]=a;
		System.out.println("Copy one Array");
		for(int i=0;i<b.length;i++)
		{
			//b[i]=a[i];
			System.out.print(b[i]+" ");
		}
	}
}