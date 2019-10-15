public abstract class Shape {
	double radius;
	double height;
	
	public Shape(double _radius, double _height)
	{
		radius = _radius;
		height = _height;
	}
	
	public double getRadius() {return radius;}
	public double getHeight() {return height;}
	
	public abstract double getVolume();
	public abstract double getSurfaceArea();
	
	public String toString()
	{
		return this.getClass().toString(); 
	}
}


