// Q17.  Write a java program to check majority element of array.


import java.util.Scanner;

public class Arrays_Majority_17
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		System.out.println("Enter elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int maj=0,ele=a[0];
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(maj<count)
			{
				maj=count;
				ele=a[i];
			}
		}	
		System.out.println("Majority element of Array : "+ele);
		
	}
}
