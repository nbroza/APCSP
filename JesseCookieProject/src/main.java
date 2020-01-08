
public class main {

	public static void main(String[] args) 
	{
		int k = 7;
		int[] cookies = new int[] { 1, 2, 3, 9, 10, 12 };

		int count = jesseCookies (k, cookies);

		System.out.println("The number of operations required is " + count);

		k = 3581;
		cookies = new int[] {6214, 8543, 9266, 1150, 7498, 7209, 9398, 1529, 1032, 7384, 6784, 34, 1449, 7598, 8795, 756, 7803, 4112, 298, 4967, 1261, 1724, 4272, 1100, 9373 };
		count = jesseCookies (k, cookies);

		System.out.println("The number of operations required is " + count);

		k = 2280;
		cookies = new int[] {9660, 9902, 5775, 2183, 3974, 7742, 576, 8786, 7615, 5575, 6287, 5495, 161, 3520, 344, 805, 786, 3802, 4843, 7424, 634, 7916, 6989, 3499, 1216, 1293, 9965, 6299, 7899, 4763, 7272, 9785, 8469, 395, 1034, 8763, 8003, 9464, 5081, 2064, 4401, 6850, 8792, 1603, 7547, 3354, 8827, 887, 8151, 2470, 9995, 7228, 8198, 5600, 1829, 8814, 5282, 3930, 2481, 6873, 9165, 497, 2158, 1752, 878, 8448, 7862 ,7685, 7988, 3536 ,8227 ,8863, 8663 ,1823, 8510 ,7065, 6927, 610 ,4220, 7096, 7685, 6992, 976, 5081, 2389, 1844 ,9843 ,8741, 9582, 3479, 420, 4136 };
		count = jesseCookies (k, cookies);

		System.out.println("The number of operations required is " + count);



		k = 10;
		cookies = new int[] { 52, 96, 13, 37};
		count = jesseCookies (k, cookies);

		System.out.println("The number of operations required is " + count);



		k = 90;
		cookies = new int[] { 13, 47, 74, 12, 89, 74, 18, 38};
		count = jesseCookies (k, cookies);

		System.out.println("The number of operations required is " + count);


		k = 1000;
		cookies = new int[] { 52, 96, 13, 37};
		count = jesseCookies (k, cookies);


		System.out.println("The number of operations required is " + count);



	}

	public static int jesseCookies(int k , int[] cookies)
	{
		int length = cookies.length;
		MinHeap heap = new MinHeap(length);
		for (int i : cookies)
		{
			heap.insert(i);
		}
		int tries = 0;
		while (heap.arr()[1] < k)
		{	
			if (heap.size() > 2)
			{
				tries++;
				int first = heap.arr()[1];
				int second = heap.arr()[2];
				heap.remove();
				heap.remove();
				int newsweet = first + (2 * second);
				heap.insert(newsweet);
			}
			else
			{
				return -1;
			}
		}
		return tries;	
	}
}
