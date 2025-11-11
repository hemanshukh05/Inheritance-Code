// Q21. Write a java program to find duck number of a array.



import java.util.Scanner;

public class Arrays_DuckNO_21
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		
		System.out.println("Enter elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Duck Numbers in array");
		for(int i=0;i<a.length;i++)
		{ 
			    int rem=0;
				boolean flag=false;
				for(int k=a[i];k>0;k=k/10)
				{
					rem=k%10;
					if(rem==0)
					{
						flag=true;
						break;
					}
				}
					if(flag)               
					{
						System.out.println(a[i]);
					}
		}
	}
}
 