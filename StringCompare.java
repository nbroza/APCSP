import java.util.Scanner;
public class StringCompare {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the first string");
		String str1 = stdin.nextLine();
		System.out.println("Enter the second string");
		String str2 = stdin.nextLine();
		
		switch (stringCompare(str1, str2)) 
		{
			case(0):
				System.out.printf("%s is equal to %s", str1, str2);
				break;
			case(1):
				System.out.printf("%s is greater than %s", str1, str2);
				break;
			case(-1):
				System.out.printf("%s is less than %s", str1, str2);
				break;
			case(2):
				System.out.printf("Error");
				break;
		}
		
	}
	
	public static int stringCompare(String sr1, String sr2)
	{
		int n1 = eval(sr1);
		int n2 = eval(sr2);
		
		if (n1 == n2)
		{
			return 0;
		}
		else if (n1 > n2)
		{
			return 1;
		}
		else if (n1 < n2)
		{
			return -1;
		}
		else 
		{
			return 2;
		}
	}
	
	public static int eval(String str)
	{
		int val = 0;
		for (int i = 0; i < str.length(); i++)
		{
			val += (int) str.charAt(i);
		}
		return val;
	}
	
}
