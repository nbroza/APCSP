public class Cylinder extends Shape
{
	public Cylinder(double _radius, double _height)
	{
		super(_radius, _height);
	}
	
	public double getVolume()
	{
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	public double getSurfaceArea()
	{
		return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
	}
}