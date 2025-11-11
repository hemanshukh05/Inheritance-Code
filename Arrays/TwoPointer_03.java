//Q3...................Count Pairs with Given Sum
//Count how many pairs in an unsorted array sum up to a target using two pointers.



import java.util.Scanner;

public class TwoPointer_03 
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

        System.out.println("Enter target value:");
        int tar=sc.nextInt();
   
		
		int count=0;
		int i=0,j=i+1;
        while(i<a.length-1)
		{
			if(a[i]+a[j]==tar)
			{
				System.out.printf("(%d , %d)\t",a[i],a[j]);
				count++;
			}
			j++;
			
			if(j==a.length)
			{
				i++;
				j=i+1;
			}
        }
		System.out.println("\nPairs in an array sum up to a target");
		System.out.println(count);
    }
}