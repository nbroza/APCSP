public class main {
	public static void main(String[] args) {
		Sphere sphere = new Sphere(8,0);
		Cylinder cyl = new Cylinder(10,5);
		Cone cone = new Cone(5, 10);

		System.out.println(sphere.toString() + " has volume " + sphere.getVolume() + " and surface area " + sphere.getSurfaceArea());
		System.out.println(cyl.toString() + " has volume " + cyl.getVolume() + " and surface area " + cyl.getSurfaceArea());
		System.out.println(cone.toString() + " has volume " + cone.getVolume() + " and surface area " + cone.getSurfaceArea());
	}
}
