/*

2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)

*/

import java.util.Scanner;

public class Arrays_TripletsZero_02
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{-1,0,1,2,-1,-4};
	
		
		for(int i=0; i<a.length; i++) 
		{
            for(int j=i+1; j<a.length-1; j++) 
			{
                for(int k=i+2;k<a.length-2; k++) 
				{
                    if(a[i] + a[j] + a[k] == 0) 
					{
                        System.out.println("(" +a[i]+ ", " +a[j]+ ", " +a[k]+ ")");
                    }
                }
            }
		}
		 
	}
}