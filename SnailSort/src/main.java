import java.util.*;
public class main {
	public static void main(String[] args) {

		int[][] input = {{1,2,3,4,5},
				{16,17,18,19,6},
				{15,24,25,20,7},
				{14,23,22,21,8},
				{13,12,11,10,9}};

		int[][] input2 = {{1,2,3,4,5,6},
				{20,21,22,23,24,7},
				{19,32,33,34,25,8},
				{18,31,36,35,26,9},
				{17,30,29,28,27,10},
				{16,15,14,13,12,11}};
		
		Integer[] snailed = snailMe(input);
		System.out.println(Arrays.toString(snailed));
		Integer[] snailed2 = snailMe(input2);
		System.out.println(Arrays.toString(snailed2));
		
	}
	
	public static Integer[] snailMe(int[][] input)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		int ri = input.length;
		int ci = input.length;
		int r = 0;
		int c = 0;
		
		while (r < ri && c < ci)
		{
			for (int i = c; i < ci; ++i)
			{
				result.add(input[r][i]);
			}
			r++;
			
			for (int i = r; i < ri; ++i)
			{
				result.add(input[i][ci - 1]);
			}
			ci--;
			
			if (r < ri)
			{
				for (int i = ci - 1; i >= c; --i) 
				{
					result.add(input[ri - 1][i]);
				}
				ri--;
			}
			
			if (c < ci)
			{
				for (int i = ri - 1; i >= r; --i)
				{
					result.add(input[i][c]);
				}
				c++;
			}
		}
		
		return result.toArray(new Integer[result.size()]);
	}
}
