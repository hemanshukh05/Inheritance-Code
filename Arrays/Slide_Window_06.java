//Q06.................Count Occurrences of Anagram
//Count how many times an anagram of a string appears in another string.




import java.util.*;

public class Slide_Window_06
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[13];
		int b[]=new int[3];
		
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
		
		System.out.println("Enter Pattern Element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Display Pattern Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	
		
		int n = a.length;
        int k = b.length;
		
		 if (k>n) {
            System.out.println("Pattern length is greater than text length.");
            return;
        }
		
		int freqPat[] = new int[1001];
        int freqWin[] = new int[1001];
		
		
		for (int i=0;i<k;i++) 
		{
            freqPat[a[i]]++;
            freqWin[b[i]]++;
        }
		
		int count = 0;

        // Slide the window over text
        for (int i=k;i<n;i++) 
		{
            if (Arrays.equals(freqPat,freqWin)) 
			{
                count++;
            }

            // Slide: remove outgoing char, add incoming char
            freqWin[a[i]]++;
            freqWin[a[i-k]]--;
        }
		// Check last window
        if (Arrays.equals(freqPat, freqWin)) 
		{
            count++;
        }

        System.out.println("Number of anagram occurrences = " + count);
		
	}
}





/*
import java.util.*;

public class Slide_Window_06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string (text):");
        String txt = sc.nextLine();

        System.out.println("Enter the pattern string:");
        String pat = sc.nextLine();

        int n = txt.length();
        int k = pat.length();

        if (k > n) {
            System.out.println("Pattern length is greater than text length.");
            return;
        }

        // Frequency arrays for pattern and window
        int freqPat[] = new int[256];
        int freqWin[] = new int[256];

        // Build frequency for pattern and first window
        for (int i = 0; i < k; i++) {
            freqPat[pat.charAt(i)]++;
            freqWin[txt.charAt(i)]++;
        }

        int count = 0;

        // Slide the window over text
        for (int i = k; i < n; i++) {
            if (Arrays.equals(freqPat, freqWin)) {
                count++;
            }

            // Slide: remove outgoing char, add incoming char
            freqWin[txt.charAt(i)]++;
            freqWin[txt.charAt(i - k)]--;
        }

        // Check last window
        if (Arrays.equals(freqPat, freqWin)) {
            count++;
        }

        System.out.println("Number of anagram occurrences = " + count);
    }
}
*/