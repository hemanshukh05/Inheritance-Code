// Q19. Write a java program to find prime number of a array.



import java.util.Scanner;

public class Array_Prime_19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{3,4,5,6,7,8,9};
		
		System.out.println("Prime Number in Array");
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
		}
		
	}
}