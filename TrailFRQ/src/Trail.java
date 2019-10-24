import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Trail {
	private int[] markers;
	
	public Trail(int[] trail)
	{
		markers = trail;
	}
	
	public boolean isLevelTrailSegment(int start, int end)
	{
	
		int[] seg = Arrays.copyOfRange(markers, start, end);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i : seg)
		{
			if (i > max)
				max = i;
			if (i < min)
				min = i;
		}

		if (max - min <= 10)
			return true;
		return false;
		
	}
	
	public boolean isDifficult()
	{
		int count = 0;
		for (int i = 1; i < markers.length; i++)
		{
			if (30 <= Math.abs(markers[i] - markers[i - 1]))
			{
				count++;
			}
		}
		
		if (3 <= count)
		{
			return true;
		}
		
		return false;
		
	}
}
