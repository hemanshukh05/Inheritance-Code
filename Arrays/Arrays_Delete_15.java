/*

Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5

*/


import java.util.Scanner;

public class Arrays_Delete_15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[a.length-1];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter Index value");
		int index=sc.nextInt();
		
		for(int i=0,j=0;i<a.length;i++)
		{
			if(i==index)
				continue;
			
			b[j++]=a[i];
			
		}
		System.out.println("Array after delete index value");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}
}