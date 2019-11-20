public class Robot 
{
	private int[] hall;
	private int pos;
	private boolean facingRight = true;
	
	public Robot(int len, int _pos)
	{
		hall = new int[len];
		pos = _pos;
	}
	
	public void addToy(int p)
	{
		hall[p - 1] += 1;
	}
	
	private boolean forwardMoveBlocked()
	{
		if (facingRight && pos == hall.length)
		{
			facingRight = false;
			return true;
		}
		
		if (!facingRight && pos == 0)
		{
			facingRight = true;
			return true;
		}
		
		return false;
	}
	
	private void move()
	{
		if (hall[pos - 1] > 0)
		{
			hall[pos - 1]--;
		}
		else
		{
			if (!forwardMoveBlocked())
			{
				if (facingRight)
				{
					pos++;
					if (hall[pos - 1] > 0)
					{
						hall[pos - 1]--;
					}
				}
				else
				{
					pos--;
					if (hall[pos - 1] > 0)
					{
						hall[pos - 1]--;
					}
				}
			}
		}
		
	}
	
	private boolean hallIsClear()
	{
		for (int i : hall)
		{
			if (i != 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public void clearHall()
	{
		int moves = 0;
		while (!hallIsClear() && moves < 20)
		{
			move();
			moves++;
		}
		System.out.println(moves);
	}
	
	public void showToys()
	{
		String s = "[ ";
		for (int i : hall)
		{
			s += i + ", ";
		}
		s += "]";
		
		System.out.println(s);
	}
	
}
