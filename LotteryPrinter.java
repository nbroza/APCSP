import java.util.Random;

public class LotteryPrinter {
	public static void main(String[] args) {
		Random gen = new Random();
		String numbers = "";
		
		for(int i = 0; i < 6; i++)
		{
			numbers += (gen.nextInt(49) + 1) + " ";
		}
		
		System.out.printf("%s", numbers);
	}
}
