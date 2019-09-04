import java.util.Scanner;
public class Continue {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("Do you want to continue?");
		String input = stdin.nextLine();
		if (input.toLowerCase().equals("y") || 
			input.toLowerCase().equals("yes") || 
			input.toLowerCase().equals("ok") || 
			input.toLowerCase().equals("sure") || 
			input.toLowerCase().equals("why not?"))
		{
			System.out.printf("OK");
		}
		else if (input.toLowerCase().equals("n") || input.toLowerCase().equals("no"))
		{
			System.out.printf("Terminating");
		}
		else
		{
			System.out.printf("Bad input");
		}
			
		
	}
}
