// Q06...............Move Zeros to End
// Move all 0s to the end of the array while maintaining the order of non-zero elements.

import java.util.*;

public class TwoPointer_06 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i=0;i<a.length;i++) 
		{
            a[i] = sc.nextInt();
        }
		
        for(int i=0,j=0;i<a.length;i++) 
		{
            if (a[i]!=0)
			{
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;

                j++;
            }
        }

        System.out.println("Array after moving zeros to end:");
        for (int i=0;i<a.length;i++) 
		{
            System.out.print(a[i]+" ");
        }
    }
}
