public class AsciiTable {
	public static void main(String[] args) {
		for (int i = 0; i < 256; i++)
		{
			char str = (char) i;
			System.out.printf("%d is %s", i, str);
			System.out.println();
		}
	}
}
