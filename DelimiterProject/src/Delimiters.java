import java.util.*;
public class Delimiters {
	private String openDel;
	private String closeDel;
	
	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}
	
	public ArrayList<String> getDelimitersList(String[] tokens)
	{
		ArrayList<String> arr = new ArrayList<String>();
		for (String s : tokens)
		{
			if (openDel.equals(s) || closeDel.equals(s))
			{
				arr.add(s);
			}
		}
		return arr;
	}
	
	public boolean isBalanced(ArrayList<String> del)
	{
		int open = 0;
		int close = 0;
		
		for (String s : del)
		{
			if (openDel.equals(s))
			{
				open++;
			}
			
			if (closeDel.equals(s))
			{
				close++;
			}
			if (close > open)
			{
				return false;
			}
		}
		
		if (open != close)
		{
			return false;
		}
		
		return true;
	}
	
	
	
	
}
