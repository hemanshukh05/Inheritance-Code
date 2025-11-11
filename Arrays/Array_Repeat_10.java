/*

Q10. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7

*/

import java.util.Scanner;

public class Array_Repeat_10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{2,3,3,5,3,4,1,7,7,7,7};
		
			
		int max=0,maxele=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++; 
			}
			if (count>max) 
			{    
                max=count;
                maxele = a[i];
            }
			
		}
		if(max==1)
		{
			System.out.println("\nNo repeat");
		}else{
		   System.out.println("\nThe maximum repeating number is:"+maxele);
		   System.out.println(max+" Times");
		}
	}
}

 