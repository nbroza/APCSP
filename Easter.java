import java.util.Scanner;

public class Easter {
    static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
	    int year = Integer.parseInt(getInput("Enter year to get the date Easter falls on: "));
		
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;
		
		System.out.printf("Easter in %d is on %d/%d", year, n, p);
	}
    public static String getInput(String prompt)  
    {
        System.out.print(prompt);
        return stdin.nextLine();
    }
}
