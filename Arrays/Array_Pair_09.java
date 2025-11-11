/*

Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
 
 */
 
import java.util.Scanner;

public class Array_Pair_09
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{5,2,3,7,6,4,9,8};
		
		int diff=5,count=0;
		System.out.println("The distinct pairs for difference "+diff);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]-a[j]==diff)
				{
					System.out.print("["+a[i]+","+a[j]+"]\t");
					count++;
				}
			}
		}
		System.out.println("\nNumber of distinct pairs for difference 5 are : "+count);
		
	}
}