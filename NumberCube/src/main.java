import java.util.Arrays;

public class main {
	public static void main(String[] args)
	{
		Cube cube = new Cube();
		
		int[] tosses = cube.getTosses(cube, 25);
		System.out.println(Arrays.toString(tosses));
		
		System.out.println();
		
		int longest = cube.longestRun(tosses);
		
		if (longest == -1)
		{
			System.out.println("No run in array");
		}
		else
		{
			System.out.println("Longest run is: " + longest);
		}
	}
}
