public class Horse implements IHorse
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
}
