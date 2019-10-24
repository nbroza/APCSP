import java.util.Scanner;
public class main {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		boolean running = true;
		
		while (running)
		{
			System.out.println("Enter a pattern number (1-6) or STOP to stop");
			String input = stdin.nextLine();
			if (input == "STOP")
			{
				running = false;
			}
			
			
			switch(input)
			{
				case "1":
					pattern1();
					break;
				case "2":
					pattern2();
					break;
				case "3":
					pattern3();
					break;
				case "4":
					pattern4();
					break;
				case "5":
					pattern5();
					break;
				case "6":
					pattern6();
					break;
			}
			
		}
	}

	
	public static void pattern1()
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 11; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern2()
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern3()
	{
		for (int i = 0; i < 5; i++)
		{	
			for (int s = 1; s <= (5 - i); s++) {
                System.out.print(" ");
            }
			
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern4()
	{
		int c = 1;
		for (int i = 5; i > 0; i--)
		{
			for (int s = 1 ; s <= i * 2 ; s++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= c ; j++)
			{
				System.out.print("* ");
			}
			
			for (int j = c - 1; j >= 1; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			c++;
		}
	}
	
	public static void pattern5()
	{
		int c = 1;
		for (int i = 5; i > 0; i--)
		{
			for (int s = 1 ; s <= i * 2 ; s++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= c ; j++)
			{
				System.out.print(c + " ");
			}
			
			for (int j = c - 1; j >= 1; j--)
			{
				System.out.print(c + " ");
			}
			System.out.println();
			c++;
		}
	}
	
	public static void pattern6()
	{
		for (int i = 1; i <= 5 ; i++)
		{
			for (int s = 1 ; s <= (5 - i) * 2 ; s++)
			{
				System.out.print(" ");
			}
			
			for (int j = i; j >= 1 ; j--)
			{
				System.out.print(" " + j);
			}
			
			for (int j = 2; j <= i; j++)
			{
				System.out.print(" " + j);
			}
			
			System.out.println();
		}
	}
	
}
