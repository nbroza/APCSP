public interface RegularPolygon {
	public int getNumSides();
	public double getSideLength();
	
	public static double totalSides(RegularPolygon[] arr)
	{
		int sides = 0;
		for (RegularPolygon p : arr)
		{
			sides += p.getNumSides();
		}
		return sides;
	}
	
	public default double getPerimeter()
	{
		return getNumSides() * getSideLength();
	}
	
	public default double getInteriorAngle()
	{
		return ((getNumSides() - 2) * 180) / getNumSides();
	}

}
