//Q07 ..........Maximum Number of Vowels in a Substring of Given Length
//Find the maximum number of vowels in any substring of length k.



import java.util.*;

public class Slide_Window_07
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=sc.nextLine();  
		str=str.toLowerCase();
		
		/*
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextLine();
		}
		System.out.println("Display Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		*/
		
		System.out.println("Enter the substring value");
		int k=sc.nextInt();
		
		if(k>str.length())
			System.out.println("Sub string length is greater string  length");
		
		int count=0;
		for (int i=0;i<k;i++) 
		{
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
                
			{
                count++;
            }
			System.out.print(ch);
        }
		int maxCount=count;
		System.out.print(" = "+maxCount);

        for(int i=k;i<str.length();i++) 
		{
            char leftChar=str.charAt(i-k);
            if(leftChar=='a'||leftChar=='e'||leftChar=='i'||leftChar=='o'||leftChar=='u') 
			{
                count--;
            }
			
			char rightChar=str.charAt(i);
            if (rightChar=='a'||rightChar=='e'||rightChar=='i'||rightChar=='o'||rightChar=='u') 
			{
                count++;
            }
			System.out.println("\n");
			for(int j=i-k+1;j<=i;j++)
			{
				char ch=str.charAt(j);
				System.out.print(ch);
			}
			System.out.print(" = "+count);
            //maxCount = Math.max(maxCount,count);
			  if(count>maxCount)
					maxCount=count;  
				
        }
		System.out.println("\nMaximum number of vowels in any substring of length "+k+" = "+ maxCount);
	}
}



 