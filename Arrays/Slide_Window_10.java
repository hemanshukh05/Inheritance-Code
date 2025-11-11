//Q10...............Sliding Window Maximum (Optional Advanced)
//Return the maximum in every window of size k (can be skipped or bonus).



import java.util.*;
public class Slide_Window_10 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter sub Array size");
		int k=sc.nextInt();
		
		System.out.println("Maximum in every window of size : "+k);
		
		int max = Integer.MIN_VALUE;
		System.out.print("{");
		for(int i=0;i<k;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			System.out.print(a[i]+" ");
		}
		System.out.print("} = "+max);
		for(int i=k;i<a.length;i++)
		{
			max=Math.max(a[i-2],Math.max(a[i-1],a[i]));
			/*if(a[i]>a[i-1] && a[i]>a[i-2])
			{
				max=a[i];
			}
			else if(a[i-1]>a[i] && a[i-1]>a[i-2])
			{
				max=a[i-1];
			}
			else
			{
				max=a[i-2];
			}*/
			System.out.printf("\n{%d %d %d } = %d",a[i-2],a[i-1],a[i],max);
		}


/*
		
		for (int i=0;i<= a.length-k;i++) 
		{
            int max = Integer.MIN_VALUE;

			System.out.print("{ ");
            for (int j=i;j<i+k;j++) 
			{
                System.out.print(a[j]+" ");
                if(a[j]>max)
				{
                    max=a[j];
                }
            }
            System.out.println("} = " + max);
        }
		
*/		
	}
}

