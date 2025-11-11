//Q5............Remove Duplicates from Sorted Array
//Remove duplicates from a sorted array using two pointers and return new length.

import java.util.*;

public class TwoPointer_05
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		int a[] = new int[10];

        System.out.println("Enter array elements:");
        for (int i=0;i<a.length;i++) 
		{
            a[i]=sc.nextInt();
        }
		
		Arrays.sort(a);
		System.out.println("Display Array");
		for (int i=0;i<a.length;i++) 
		{
             System.out.print(a[i]+" ");
        }
		//int b[]=new int[a.length];   
     
	    int count=1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=a[count-1])
			{
				a[count]=a[i];
				count++;
			}	
		}
		System.out.println("\nDisplay Array");
		for (int i=0;i<count;i++) 
		{
            System.out.print(a[i]+" ");
        }
    }
}

    
    