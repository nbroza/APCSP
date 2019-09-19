import java.util.Scanner;
public class SquareRoot {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		double number = Double.parseDouble(stdin.nextLine());
		System.out.println();
		System.out.println("Enter initial: ");
		double initial = Double.parseDouble(stdin.nextLine());
		sqrt(number, initial, .00001);
	}
	
	public static void sqrt(double n, double i, double e)
	{
		double g1 = i;
		double g2 = n/i;

		while (Math.abs(g1 - g2) > e)
		{
			g1 = (g1 + g2) / 2;
			g2 = n / g1;
			System.out.printf("Guessing %1.15f", g1);
			System.out.println();
		}
		System.out.printf("Final %1.15f", g1);
	}
}
