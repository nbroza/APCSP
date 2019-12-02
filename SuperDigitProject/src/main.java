
public class main {

	public static void main(String[] args) {	
		System.out.println(superDigit("9875", 4));
		System.out.println(superDigit("861568688536788", 100000));
	}

	public static int superDigit(String s, int n)
	{
		if (s.length() > 1)
		{
			int sum = 0;
			for (char c : s.toCharArray())
			{
				sum += Character.getNumericValue(c);
			}
			sum *= n;
			return superDigit(Integer.toString(sum), 1);
		}
		else
		{
			return Integer.parseInt(s);
		}
	}
}
