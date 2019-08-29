import java.util.Scanner;
public class TwoFP {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("Enter two floating point numbers: ");
		Float n1 = Float.parseFloat(stdin.nextLine());
		Float n2 = Float.parseFloat(stdin.nextLine());
		
		if (Math.abs(n1 - n2) < 0.01)
		{
			System.out.printf("The numbers differ by less than 0.01");
		}
		
		System.out.println();
		
		if ((Math.round(n1 * 100) / 100) ==(Math.round(n2 * 100) / 100))
		{
			System.out.printf("The numbers are the same when rounded to two decimal places");
		}
	}
}
