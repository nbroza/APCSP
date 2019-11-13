public class main {
	public static void main(String[] args) {
		RegularPolygon[] polygons = new RegularPolygon[4];
		polygons[0] = new Square(5);
		polygons[1] = new EquilateralTriangle(7);
		polygons[2] = new Heptagon(9);
		polygons[3] = new DoDecagon(11);

		for (RegularPolygon p : polygons)
		{
			System.out.println(p.getClass() + " with side length " + p.getSideLength() + " has perimeter " + p.getPerimeter() + " and interior angle " + p.getInteriorAngle());
		}
		System.out.println("The total numbers of sides for the polygon system is " + RegularPolygon.totalSides(polygons));
	}
}
