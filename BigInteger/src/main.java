import java.math.BigInteger;

public class main {
	public static void main(String[] args) {
		long[] input = new long[] {2, 1, 5351871996120528L,
				2248813659738258L,
				2494359640703601L,
				6044763399160734L,
				3271269997212342L,
				4276346434761561L,
				2372239019637533L,
				5624204919070546L,
				9493965694520825L,
				8629828692375133L};
		
		for (int i = 0; i < input.length; i++)
		{ 
			long n = doTheSum(input[i]);
			System.out.println("The series sum of " + input[i] + " is " + n);
		}
	}
	
	public static long doTheSum(long i)
	{	
		BigInteger n = BigInteger.valueOf(i);
		BigInteger n1 = BigInteger.valueOf(1);
		BigInteger n2 = n.multiply(BigInteger.valueOf(2)).subtract(BigInteger.valueOf(1));
		BigInteger sum = n.multiply(n1.add(n2)).divide(BigInteger.valueOf(2));
		BigInteger div = BigInteger.valueOf(1000000007);
		BigInteger mod = sum.mod(div);
		return mod.longValue();
	}
}
