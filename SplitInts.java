public class SplitInts {
	public static void main(String[] args) {
		int n = 123456;
		while (n > 0)
		{
			System.out.printf("%d", n % 10);
			System.out.println();
			n = n / 10;
		}
	}
}
