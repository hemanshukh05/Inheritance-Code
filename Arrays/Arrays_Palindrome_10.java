// Q10.Write a java program to check array is palindrome or not.

import java.util.Scanner;

public class Arrays_Palindrome_10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display elements of array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		int b[]=new int[a.length];
		
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{													//b[i]=a[a.length-1-i];   
			b[j]=a[i];
			j++;
		}
		System.out.println("\nReversed Array is ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		boolean flag=true;
        for (int i=0;i<a.length;i++) 
		{
            if(a[i]!=b[i]) 
			{
                flag=false;
                break;
            }
        }
		if(flag)
			System.out.println("\nPalindrome");
		else 
			System.out.println("\nNot Palindrome");
		
	}
	
}