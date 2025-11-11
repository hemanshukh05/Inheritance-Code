//Q10.......Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
//Check if two strings are anagrams using sorting and comparing via two pointers.





import java.util.*;

public class TwoPointer_10
{   
	public static void main(String x[])
	{
	   Scanner sc= new Scanner(System.in);
	   int a[]=new int[5];
	   int b[]=new int[5];
	   
	   boolean flag=true;
	   System.out.println("Enter values in first array");
	   for(int i=0; i<a.length; i++)
	   {
	       a[i]=sc.nextInt();
	   }
	   
	   System.out.println("Enter values in second array");
	   for(int i=0; i<b.length; i++)
	   {  
			b[i]=sc.nextInt();
	   }
	   Arrays.sort(a);  
	   Arrays.sort(b);  
	   
	   for(int i=0;i<a.length;i++)
	   {
	        if(a[i]!=b[i])
			{
				flag=false;
			    break;
			}
	   }
	   if(flag)
	   {  
			System.out.println("Array is anagram");
	   }
	   else
	   { 
			System.out.println("Array is not anagram");
	   }
	   
	}
}
