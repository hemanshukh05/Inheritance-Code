// Q9. Write java program to merge two array and display it.


import java.util.Scanner;

public class Arrays_Merge_09
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[]{60,70,80,90,100};
		int c[]=new int[a.length + b.length];
		
		int j=0,k=0;
		for(int i=0;i<c.length;i++)
			if(i<a.length)
			{
				c[i]=a[j];
				j++;
			}
			else
				{
				c[i]=b[k];
				k++;
			}
			
		System.out.println("Merge Array is ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
	
}
