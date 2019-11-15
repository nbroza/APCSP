public class Horse implements IHorse, Comparable<Horse>
{
	String name;
	int weight;
	
	public Horse(String _name, int _weight)
	{
		name = _name;
		weight = _weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public int compareTo(Horse h)
	{
		if (this.weight == h.getWeight())
		{
			return 0;
		}
		
		if (this.weight > h.getWeight())
		{
			return 1;
		}
		
		return -1;
	}
	
	public String toString()
	{
		return  name + " " + weight;
	}
	
}
