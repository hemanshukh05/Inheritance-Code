// Q6. Write a java program to search element in array , its element found or not.


import java.util.Scanner;

public class Arrays_Search_06
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{15,10,20,35,30,40,50};
		
		System.out.println("Enter element to be search");
		int skey=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(skey==a[i])
				flag=true;
		}
		String re= flag?"Element is Found":"Element is not Found";
		System.out.println(re);
	}
	
}