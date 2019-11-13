import java.util.*;

public class HorseBarn
{
	private Horse[] spaces;
	
	public HorseBarn(int slots)
	{
		spaces = new Horse[slots];
	}
	
	public boolean addHorse(String name, int weight)
	{
		boolean fits = false;
		for (int i = 0; i < spaces.length; i++)
		{
			if (spaces[i] == null)
			{		
				spaces[i] = new Horse(name, weight);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeHorse(String name)
	{
		for (int i = 0; i < spaces.length; i++)
		{
			if (spaces[i] != null && name.equals(spaces[i].getName()))
			{
				spaces[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public int findHorseSpace(String name)
	{
		for (int i = 0; i < spaces.length - 1; i++)
		{
			if (name.equals(spaces[i].getName()))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void showBarn()
	{
		int i = 1;
		for (Horse h : spaces)
		{
			if (h == null)
			{
				System.out.println("Spot " + i + " is empty");
			}
			else
			{
				System.out.println("Spot " + i + " contains " + h.getName() + " with weight " + h.getWeight());
			}
			i++;
		}
	}
	
	public void consolidate()
	{
		for (int i = 0; i < spaces.length; i++)
		{
			if (spaces[i] == null)
			{
				for (int j = i + 1; j < spaces.length; j++)
				{
					if (spaces[j] != null)
					{
						spaces[i] = spaces[j];
						spaces[j] = null;
						break;
					}
				}
			}
		}
	}
}
