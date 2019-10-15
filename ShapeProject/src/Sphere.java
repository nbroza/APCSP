public class Sphere extends Shape
{
	public Sphere(double _radius, double _height)
	{
		super(_radius, _height);
	}
	
	public double getVolume()
	{
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
	}
	
	public double getSurfaceArea()
	{
		return 4 * Math.PI * Math.pow(radius, 2);
	}
}
