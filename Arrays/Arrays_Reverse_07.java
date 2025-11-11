//Q7. Write a java program to display the reverse array.

import java.util.Scanner;

public class Arrays_Reverse_07
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{10,20,30,40,50,60};
		int b[]=new int[a.length];
		
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			//b[j]=a[i];
			//j++;
			b[i]=a[a.length-1-i];
		}
		System.out.println("Reversed Array is ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	
}


 

        