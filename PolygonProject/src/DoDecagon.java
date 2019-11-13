public class DoDecagon implements RegularPolygon
{
	int numSides = 12;
	double sideLength;
	
	public DoDecagon(double _sideLength)
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