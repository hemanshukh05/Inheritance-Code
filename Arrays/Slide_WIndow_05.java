//Q05...........Longest Substring Without Repeating Characters
//Return the length of the longest substring with all unique characters.



import java.util.*;

public class Slide_WIndow_05
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];   
		
		System.out.println("Enter the String");
		String str=sc.nextLine();
		/*
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		*/

        char freq[] = new char[1001];

        int left=0,maxLen=0,index=0;
		
		
		for(int right=0;right<str.length();right++)
		{
			char num=str.charAt(right);
			freq[num]++;
			
			while(freq[num]>1)
			{
				freq[str.charAt(left)]--;
				left++;
			}
			
			if(right-left+1>maxLen)
			{
				maxLen=right-left+1;
				index=left;
			}
		}
		
		/*
        for (int right=0;right<a.length;right++) 
		{
            int num=a[right];
            freq[num]++;

            // If number repeats, shrink window
            while (freq[num]>1) 
			{
                freq[a[left]]--;
                left++;
            }

            // Update max length and starting index
            if (right-left+1 >maxLen) 
			{
                maxLen=right-left+1;
                index=left;
            }
        }
		*/
		System.out.println("Length of Longest Subarray without repeating numbers = " + maxLen);
        System.out.print("Longest Subarray = [ ");
		
		for(int i=index;i<index+maxLen;i++)
		{
			System.out.print(str.charAt(i));
		}
		/*
        for (int i=index;i<index+maxLen;i++) 
		{
            System.out.print(a[i] + " ");
        }*/
        System.out.println("]");
        
	}
}
