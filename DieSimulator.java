import java.util.Random;

public class DieSimulator {
	public static void main(String[] args) {
		Random gen = new Random();
		System.out.printf("%d", gen.nextInt(6) + 1);
	}
}
