// Q1.........Sum of Two Numbers Equals Target
//Given a sorted array and a target, check if there are two numbers that sum up to the target
// 1 2 3 4 5    7



import java.util.Scanner;

public class TwoPointer_01 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

        System.out.println("Enter sorted array elements:");
        for (int i=0;i<n;i++) 
		{
            a[i]=sc.nextInt();
        }

        System.out.println("Enter target value:");
        int tar=sc.nextInt();

        int left = 0;          
        int right =a.length-1;    
        boolean found=false;

        for(i=0,j=a.length-1;i<j)
		{
            int sum=a[i]+a[j];

            if (sum==tar) 
			{
                System.out.printf("Pair found: %d +%d =tar",a[i],a[j]);
                found = true;
            }
            else if(sum<tar) 
			{
                left++;  
            }
            else 
			{
                right--;  
			}
        }

        if(!found) 
		{
            System.out.println("\nNo pair found for target " + target);
        }
    }
}