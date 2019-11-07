import java.util.*;
public class main {
	public static void main(String[] args) {
		int[][] basic = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };
		int[][] allneg = new int[][] { {-10,-12,-3}, {-4,-5,-6,-8}, {-7,-8} };
		int[][] nonsquare = new int[][] { {1,2,3}, {4,5}, {6,7,8,9} };
		int[][] negatives = new int[][] { {1,-2,3}, {4,5,6}, {-7,8,-9} };
		int[][] rowmagic = new int[][] { {1,2,3}, {-1,5,2}, {4,0,2} };
		int[][] colmagic = new int[][] { {1,-1,4,10}, {3,5,0,-6} };
		int[][] latin = new int[][] { {1,2,3}, {2,3,1}, {3,1,2} };
		int[][] notlatin = new int[][] { {2,1,3}, {2,3,1}, {3,1,2} };
		int[][] magic = new int[][] { {2,2,2}, {2,2,2}, {2,2,2} };
		int[][] notmagic1 = new int[][] { {1,2,3}, {4,5,6}, {6,8,9} };
		int[][] notmagic2 = new int[][] { {1,5,3}, {4,5,6}, {7,8,9} }; 

		System.out.println(max(basic) + " | 9");
		System.out.println(max(allneg) + " | -3");
		System.out.println(rowSum(basic, 0) + " | 6");
		System.out.println(rowSum(basic, 1) + " | 15");
		System.out.println(rowSum(basic, 2) + " | 24");
		System.out.println(rowSum(nonsquare, 2) + " | 30");
		System.out.println(columnSum(basic, 0) + " | 12");
		System.out.println(columnSum(basic, 1) + " | 15");
		System.out.println(columnSum(basic, 2) + " | 18");
		System.out.println(columnSum(nonsquare, 2) + " | 11");
		System.out.println(columnSum(nonsquare, 3) + " | 9");
		System.out.println(Arrays.toString(allRowSums(basic)) + " | [6, 15, 24]");
		System.out.println(isRowMagic(rowmagic) + " | true");
		System.out.println(isRowMagic(basic) + " | false");
		System.out.println(isColumnMagic(colmagic) + " | true");
		System.out.println(isColumnMagic(rowmagic) + " | false");
		System.out.println(isSquare(basic) + " | true");
		System.out.println(isSquare(nonsquare) + " | false");
		System.out.println(isMagic(magic) + " | true");
		System.out.println(isMagic(allneg) + " | false");
		System.out.println(isMagic(notmagic1) + " | false");
		System.out.println(isMagic(notmagic2) + " | false");	
		System.out.println(isLatin(latin) + " | true");
		System.out.println(isLatin(basic) + " | false");
		System.out.println(isLatin(nonsquare) + " | false");
		System.out.println(isLatin(notlatin) + " | false");
		System.out.println(isSequence(basic) + " | true");
		System.out.println(isSequence(nonsquare) + " | false");
		System.out.println(isSequence(magic) + " | false");
		System.out.println(isSequence(negatives) + " | false");	
	}
	
	public static int max(int[][] arr)
	{
        int maxValue = arr[0][0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                if (arr[j][i] > maxValue) {
                    maxValue = arr[j][i];
                }
            }
        }
        return maxValue;
	}
	
	public static int rowSum(int[][] arr, int x)
	{
		int sum = 0;
		int r = arr[x].length;
		
		for (int i = 0; i < r; i++)
		{
			sum += arr[x][i];
		}
		return sum;
	}
	
	public static int columnSum(int[][] arr, int x)
	{
		int sum = 0;
		int c = arr.length;
		
		for (int i = 0; i < c; i++)
		{
			try
			{
				sum += arr[i][x];
			}
			catch(Exception ArrayIndexOutOfBounds)
			{
				continue;
			}
		}
		return sum;
	}
	
	public static int[] allRowSums(int[][] arr)
	{
		int r = arr.length;
		int c = arr[0].length;
		int[] sums = new int[r];
		
		for (int i = 0; i < r; i++)
		{
			int sum = 0;
			for (int j = 0; j < c; j++)
			{
				try
				{
					sum += arr[i][j];
				}
				catch(Exception ArrayIndexOutOfBounds)
				{
					continue;
				}

			}
			sums[i] = sum; 
		}
		return sums;
	}
	
	public static int[] allColumnSums(int[][] arr)
	{
		int r = arr.length;
		int c = arr[0].length;
		int[] sums = new int[c];
		
		for (int i = 0 ; i < c; i++)
		{
			int sum = 0;
			for (int j = 0; j < r; j++)
			{
				try
				{
					sum += arr[j][i];
				}
				catch(Exception ArrayIndexOutOfBounds)
				{
					continue;
				}
			}
			sums[i] = sum;
		}
		return sums;
	}
	
	public static boolean diagonalSum(int[][] arr)
	{
		int s1 = 0;
		int s2 = 0;
		int r = arr.length;
		
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < r; j++)
			{
				if (i == j)
				{
					s1 += arr[i][j];
				}
				
				if ( (i + j) == (r - 1))
				{
					s2 += arr[i][j];
				}
			}
		}
		
		if (s1 == s2)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isRowMagic(int[][] arr)
	{
		int[] sums = allRowSums(arr);
		int prev = sums[0];
		
		for(int i : sums)
		{
			if (i != prev)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isColumnMagic(int[][] arr)
	{
		int[] sums = allColumnSums(arr);
		int prev = sums[0];
		
		for(int i : sums)
		{
			if (i != prev)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isSquare(int[][] arr)
	{
		int r = arr.length;
		int c = arr[0].length;
		
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				if (arr.length!= arr[i].length)
				return false;
			}
		}
		return true;
	}
	
	public static boolean isMagic(int[][] arr)
	{
		if (isSquare(arr) && isRowMagic(arr) && isColumnMagic(arr) && diagonalSum(arr))
		{
			return true;
		}
		return false;
	}
	
	public static boolean isLatin(int[][] square)
	{
		if (!isSquare(square))
			return false;
		
		boolean[][] foundInRow = new boolean[square.length][square.length];
	    boolean[][] foundInCol = new boolean[square.length][square.length];
	    for (int row = 0; row < square.length; row++) {

	        for (int col = 0; col < square.length; col++) {
	            int idx = square[row][col];
	            
	            if (idx > square.length || idx < 0)
	            	return false;
	            
		        if (foundInRow[row][idx - 1] || foundInCol[col][idx - 1])
		        {
		           return false;
	            }
		        
	            foundInRow[row][idx - 1] = true;
	            foundInCol[col][idx - 1] = true;
	          
	        }
	    }
	    return true;
	}
	
	public static boolean isSequence(int[][] arr)
	{
		int r = arr.length;
		if (!isSquare(arr))
			return false;
		
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		
		for (int i = 0; i < (r * r) + 1; i++)
		{
			nums.add(i);
		}
		
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < r; j++)
			{
				if (!nums.contains(arr[i][j]))
				{		
					return false;
				}
				
				nums.remove(nums.indexOf(arr[i][j]));
			}
		}
		return true;
	}
}
