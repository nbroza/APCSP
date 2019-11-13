public class Heptagon implements RegularPolygon
{
	int numSides = 5;
	double sideLength;
	
	public Heptagon(double _sideLength)
	{
		sideLength = _sideLength;
	}
	
	public int getNumSides()
	{
		return numSides;
	}
	
	public double getSideLength()
	{
		return sideLength;
	}
}
