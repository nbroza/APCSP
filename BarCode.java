import java.util.Scanner;
import java.util.*;
public class BarCode {
	static Scanner stdin = new Scanner(System.in);
	static String[] digits = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
	public static void main(String[] args) {
		System.out.println("Enter a zip code to convert to bar code: ");
		String zip = stdin.nextLine();
		breakZip(zip);
		
		System.out.println();
		System.out.println("Enter a barcode to convert to zip code: ");
		String code = stdin.nextLine();
		toZip(code);
	}
	
	public static void breakZip(String zip)
	{
		System.out.print('|');
		int sum = 0;
		for (char c : zip.toCharArray())
		{
			int n = Character.getNumericValue(c);
			sum += n;
			printDigit(n);
		}
		int check = sum / 10;
		printDigit(check);
		System.out.print("|");
	}
	
	public static void toZip(String s)
	{
		int j = 6;
		for (int i = 1; i < 25; i+=5)
		{
			int n = Arrays.asList(digits).indexOf(s.substring(i,j));
			System.out.print(n);
			j += 5;
		}
	}
	
	public static void printDigit(int n)
	{

		System.out.print(digits[n]);
	}
}
