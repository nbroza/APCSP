public class EquilateralTriangle implements RegularPolygon
{
	
	int numSides = 3;
	double sideLength;
	
	public EquilateralTriangle(double _sideLength)
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
