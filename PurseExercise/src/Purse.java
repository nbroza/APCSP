import java.util.*;
public class Purse {
	private ArrayList<String> coins = new ArrayList<String>();
	static final String[] knownCoins = {"penny", "nickel", "dime", "quarter", "half dollar", "dollar"};
	public void Purse(){}
	
	public void addCoin(String coinName)
	{
		
		if (Arrays.asList(knownCoins).contains(coinName.toLowerCase()))
		{
			coins.add(coinName);
		}

	}
	
	public void transfer(Purse other)
	{
		for(String s : coins)
		{
			other.addCoin(s);
		}
		coins.clear();
	}
	
	public boolean sameCoins(Purse other)
	{
		if (other.toString().equals(this.toString()))
		{
			return true;
		}
		return false;
	}
	
	public void reverseCoins()
	{
		Collections.reverse(coins);
	}
	
	public String toString()
	{
		
		if (coins.size() == 0)
		{
			return "Empty";
		}
		else
		{
			String fs = "";
			for(String s : coins)
			{
				fs += s + ", ";
			}
			
			fs = fs.substring(0, fs.length() - 2);
			
			return "Purse[" + fs + "]";
		}
		

	}
}
