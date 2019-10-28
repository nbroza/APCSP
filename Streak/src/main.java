import java.util.*;
import java.util.Map.Entry;

public class main {
	public static void main(String[] args) {
		System.out.println(longestStreak("CCCAAAAATTT!"));
		System.out.println(longestStreak("DDOOOGGGGG!"));
		System.out.println(longestStreak("BBBBBIIIRRRDDD!"));
	}
	
	public static String longestStreak(String str)
	{
		int n = 1;
		int prevcount = 0;
		char prev = 0;
		char character = 0;
		
		for (int i = 0; i < str.length() - 1; i++)
		{
			if(str.charAt(i) == str.charAt(i + 1))
			{
				n++;
				prev = str.charAt(i);
			}
			else
			{
				if (n > prevcount)
				{
					prevcount = n;
					character = prev;
				}
				n = 1;
			}
		}
		
		return character + " " + prevcount;
	}
	
}
