// Q5. Write a java program to find positive and negative number in array.


import java.util.Scanner;

public class Arrays_NePo_05
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{-11,15,-10,45,-46,50};
		
		/*System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}*/
	    System.out.println("Negative positive number in Array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
				System.out.println(a[i]+ " is  Negative");
			else 
				System.out.println(a[i]+ "  is  Positive");
		}
	
	}
	
}