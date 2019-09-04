public class Sum10Reciprocals {
	public static void main(String[] args) {
		float sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum += 1.0/i;
		}
		System.out.printf("%f", sum);
	}
}
