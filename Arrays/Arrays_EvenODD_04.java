//  Q4. Write a java program to find even and odd number in array.


import java.util.Scanner;

public class Arrays_EvenODD_04
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{11,15,10,45,46,50};
		
		/*System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}*/
	    System.out.println("Even Odd elements in Array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]+ " is Even");
			else 
				System.out.println(a[i]+ " is Odd");
		}
	
	}
	
}