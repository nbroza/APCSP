public class main {
	public static void main(String[] args) {
		Purse purseA = new Purse();
		Purse purseB = new Purse();
		Purse purseC = new Purse();
		
		purseA.addCoin("nickel");
		purseA.addCoin("Dime");
		purseA.addCoin("coin");
		purseA.addCoin("half dollar");
		
		purseC.addCoin("nickel");
		purseC.addCoin("Dime");
		purseC.addCoin("coin");
		purseC.addCoin("half dollar");
		
		System.out.print(purseA.toString());
		System.out.println();
		
		purseA.reverseCoins();
		
		System.out.print(purseA.toString());
		System.out.println();
		
		purseB.addCoin("penny");
		System.out.print(purseB.toString());
		System.out.println();
		
		purseA.transfer(purseB);
		System.out.print(purseB.toString());
		System.out.println();

		purseA.addCoin("nickel");
		purseA.addCoin("Dime");
		purseA.addCoin("coin");
		purseA.addCoin("half dollar");
		
		if (purseA.sameCoins(purseC))
		{
			System.out.print("The purses contain the same coins");
		}
		else
		{
			System.out.print("The purses don't contain the same coins");
		}
		
		

	}
}
