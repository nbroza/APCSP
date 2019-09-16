import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class isDivisor {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		int num = Integer.parseInt(stdin.nextLine());
		int second = Integer.parseInt(stdin.nextLine());
		for(Object n: firstNumSelfDivisors(num, second))
		{
			System.out.printf("%s\n", n.toString());
		}
	}
	
	public static boolean Divisor(int n)
	{
		String str = Integer.toString(n);
		boolean isDivisor = true;
		for (int i = 0; i < str.length(); i++)
		{
			char num = str.toCharArray()[i];
			if (n % Integer.parseInt(String.valueOf(num)) != 0 || Integer.parseInt(String.valueOf(num)) == 0)
			{
				isDivisor = false;
			}
		}
		return isDivisor;
	}
	
	public static Object[] firstNumSelfDivisors(int s, int n)
	{
		List<Integer> nums = new ArrayList<Integer>();
		int i = 1;
		while (nums.size() < n)
		{
			if(Divisor(s+i))
			{
				nums.add(s+i);
			}
			i++;
		}
		return nums.toArray();
	}
}
