import java.util.Scanner;
public class LeapYear {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("Enter a year");
		int year = Integer.parseInt(stdin.nextLine());
		
		if (year < 1582 && year % 4 == 0)
		{
			System.out.printf("Leap year");
		}
		else
		{
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 ))
			{
				System.out.printf("Leap year");
			}
			else 
			{
				System.out.printf("Not a leap year");
			}
		}
	}
}
