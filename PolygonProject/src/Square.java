public class Square implements RegularPolygon
{
	int numSides = 4;
	double sideLength;
	
	public Square(double _sideLength)
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
