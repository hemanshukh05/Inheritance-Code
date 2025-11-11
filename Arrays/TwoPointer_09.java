// Q09.............Sort Colors (Dutch National Flag Problem)
// Sort an array of 0s, 1s, and 2s using three pointers.

import java.util.*;

public class TwoPointer_09 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter array elements (only 0,1,2):");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }

        int low=0,mid =0, high=a.length-1;

        // Dutch National Flag Algorithm
        while (mid <= high) 
		{
            if (a[mid] == 0) 
			{
                // swap a[low] and a[mid]
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;

                low++;
                mid++;
            } 
            else if (a[mid] == 1) 
			{
                mid++;
            } 
            else
			{ // a[mid] == 2
                // swap a[mid] and a[high]
                int temp = a[mid];
                a[mid]=a[high];
                a[high]=temp;

                high--;
            }
        }

        System.out.println("Sorted Array:");
        for (int i=0;i<a.length;i++)
		{
            System.out.print(a[i]+" ");
        }
    }
}