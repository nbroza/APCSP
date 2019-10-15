public class Cone extends Shape
{
	public Cone(double _radius, double _height)
	{
		super(_radius, _height);
	}
	
	public double getVolume()
	{
		return Math.PI * Math.pow(radius, 2) * (height/3.0);
	}
	
	public double getSurfaceArea()
	{
		return (Math.PI * radius) * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
	}
}
