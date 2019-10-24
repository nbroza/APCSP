public class main {
	public static void main(String[] args) {
		int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		Trail trail = new Trail(markers);

		if (trail.isLevelTrailSegment(7, 10))
		{
		System.out.println("The trail is level from marker 7 to 10.");
		}
		else
		System.out.println("The trail is NOT level from marker 7 to 10.");


		if (trail.isLevelTrailSegment(0, 4))
		{
		System.out.println("The trail is level from marker 0 to 4.");
		}
		else
		System.out.println("The trail is NOT level from marker 0 to 4.");

		if (trail.isDifficult())
		{
		System.out.println("The trail is difficult.");
		}
		else
		System.out.println("The trail is NOT difficult.");
	}
}
