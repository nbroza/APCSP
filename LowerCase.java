public class LowerCase {
	public static void main(String[] args) {
		String str = "The quick brown fox jumped over the lazy dog!";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++)
		{
			if ( 123 > (int) str.charAt(i) && (int) str.charAt(i) > 96)
			{
				int ascii = (int) str.charAt(i) - 32;
				sb.append((char) ascii);
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		System.out.printf("%s", sb.toString());
	}

}
