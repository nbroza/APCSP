public class MagicSquare {

	int size;
	
	MagicSquare(int _size)
	{
		size = _size;
	}
	
	private int[][] genSquare()
	{
		int[][] square = new int[size][size];
		
		int r = size - 1;
		int c = size / 2;
		
		for (int i = 1; i <= (size * size); i++)
		{
			square[r][c] = i;
			r = (r + 1) % size;
			c = (c + 1) % size;
			
			if (square[r][c] != 0)
			{
				r = (r - 2 + size) % size;
				c = (c - 1 + size) % size;
			}
		}
		
		return square;
	}
	
	public String toString()
	{
		String s = "";
		int[][] square = genSquare();
		
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				s += square[i][j] + " ";
			}
			s += "\n";
		}
		return s;
	}
	
}
