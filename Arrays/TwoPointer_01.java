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
        for (int i=0;i<a.length;i++) 
		{
            a[i]=sc.nextInt();
        }

        System.out.println("Enter target value:");
        int tar=sc.nextInt();
   
        boolean flag=false;

        for(int i=0,j=a.length-1;i<j;)
		{

            if(a[i]+a[j]==tar) 
			{
                System.out.printf("\nPair found: %d + %d = %d",a[i],a[j],tar);
                flag=true;
				i++;
				j--;
            }
            else if(a[i]+a[j]<tar) 
			{
                i++;  
            }
            else 
			{
                j--;  
			}
        }

        if(!flag) 
		{
            System.out.println("\nNo pair found for target "+tar);
        }
    }
}