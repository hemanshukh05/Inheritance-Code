// Q18. Write a java program to remove duplicates values of array.
 
 


import java.util.Scanner;

public class Arrays_RemoDuplicate_18
{
	public static void main(String args[])
	
	
	
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{5,5,3,5,6,7,8,9,6,4,7,9};
		
        int b[]=new int[a.length];   
        int k=0;               
        for(int i=0;i<a.length;i++) 
		{
            boolean flag=false;
            for(int j=0;j<k;j++) 
			{  
                if(a[i]==b[j])
				{
                    flag=true;
                    break;
                }
            }
			
            if (!flag) 
			{
                b[k]=a[i];
                k++;
            }
        }
		System.out.println("Array after removing duplicates");
		for(int i=0;i<k;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}
}