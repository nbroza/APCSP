package getLetterGrade;
import java.util.Scanner;
public class getLetterGrade {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("Enter a letter grade");
		String input = stdin.nextLine();
		double gpa = 0;
		
		if (input.toCharArray()[0] == 'A')
		{
			gpa = 4.0;
		}
		else if (input.toCharArray()[0] == 'B')
		{
			gpa = 3.0;
		}
		else if (input.toCharArray()[0] == 'C')
		{
			gpa = 2.0;
		}
		else if (input.toCharArray()[0] == 'D')
		{
			gpa = 1.0;
		}
		
		if (input.length() > 1 && input.toCharArray()[0] != 'F')
		{
			if (input.toCharArray()[1] == '+' && input.toCharArray()[0] != 'A')
			{
				gpa += 0.3;
			}
			else if (input.toCharArray()[1] == '-')
			{
				gpa -= 0.3;
			}
		}

		System.out.printf("Your GPA is %2.2f", gpa);
	}
}
