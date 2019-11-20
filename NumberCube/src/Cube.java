import java.util.*;
public class Cube {
	
	public int toss()
	{
		Random r = new Random();
		return (r.nextInt(6) + 1);
	}
	
	public int[] getTosses(Cube cube, int tosses)
	{
		int[] arr = new int[tosses];
		
		for (int i = 0; i < tosses; i++)
		{
			arr[i] = toss();
		}
		
		return arr;
	}
	
	public int longestRun(int[] values)
	{
		int current = 0;
		int overall = -1;
		
		for (int i = 1; i < values.length; i++)
		{
			if (values[i] == values[i-1])
			{
				current++;
				
				if(current > overall)
				{
					overall = current;
				}
			}
			else
			{
				current = 0;
			}
		}
		return overall + 1;
	}
}
