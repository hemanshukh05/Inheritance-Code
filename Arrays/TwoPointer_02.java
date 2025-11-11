// Q2..........Check Palindrome Using Two Pointers
//Check if a string(Array) is a palindrome using the two-pointer approach.


import java.util.Scanner;

public class TwoPointer_02
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		//int b[]=new int[a.length];
		
		System.out.println("Enter elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Array"); 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		/*for(int i=0,j=a.length-1;i<=j;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("\nDisplay Array"); 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}*/
		boolean flag=true;
	    for(int i=0,j=a.length-1;i<a.length;i++,j--)
		{
			if(a[i]!=a[j])
				flag=false;
		}
		if(flag)
			System.out.println("\nArray is palindrome"); 
		else 
			System.out.println("\nArray is not palindrome"); 
			
	}
}