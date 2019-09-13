import java.util.Scanner;
public class SubstringPalindrome {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str = stdin.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--)
		{
			sb.append(str.charAt(i));
		}
		String rev = sb.toString();
		int sublen = palSub(str, rev);
		System.out.printf("%d", sublen);
		
	}
	
	public static int palSub(String str, String rev)
	{
		int max = 0;
		
		for (int i = 0; i < str.length(); i++)
		{
			for (int j = i; j < str.length(); j++)
			{
				String sub = str.substring(i, j + 1);
				if (rev.contains(sub) && sub.length() > max)
				{
					max = sub.length();
				}
			}
		}
		return max;
	}

}
