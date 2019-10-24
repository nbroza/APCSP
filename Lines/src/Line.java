public class Line {
	private double m;
	private double b;
	
	public double getM() {return m;}
	public double getB() {return b;}
	
	public Line(double _x1, double _y1, double _x2, double _y2)
	{		
		m = (_y1 - _y2)/(_x1 - _x2);
		b = (_y1 - m * (_x1));
		if (Double.toString(m) == "-Infinity")
		{
			m = 0;
			b = _x1;
		}
	}
	
	public Line(double _x1, double _y1, double _m)
	{
		m = _m;
		b = (_y1 - m * (_x1));
	}
	
	public Line(double _m, double _b)
	{
		m = _m;
		b = _b;
	}
	
	public Line(double _b)
	{
		m = 0;
		b = _b;
	}
	
	public boolean intersects(Line other)
	{
		if (m != other.getM() || 0 == other.getM())
			return true;
		return false;
	}
	
	public boolean equals(Line other)
	{
		if (m == other.getM() && b == other.getB())
			return true;
		return false;
	}

	public boolean isParallel(Line other)
	{
		if (m == 0 && other.getM() == 0)
			return true;
		if (m == other.getM() && b != other.getB())
			return true;
		return false;
	}
}
