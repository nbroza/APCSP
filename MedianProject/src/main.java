import java.io.*;
import java.util.*;
public class main {
	public static void main(String[] args) {
		try
		{
			File txt = new File("H:/Downloads/median.txt");
			Scanner scan = new Scanner(txt);
			int count = scan.nextInt();
			int[] data = new int[count];
			for (int i = 0; i < count; i++)
			{
				data[i] = scan.nextInt();
			}
	
			System.out.println("The median is " + median(data));
	
	
			scan.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static int[] sort(int[] arr)
	{
		int n = arr.length;
		
		int count[] = new int[100];
		
		for (int i = 0; i < n; i++)
		{
			count[arr[i]]++;
		}
	
		return count;
	}
	
	public static int median(int[] in)
	{
		int[] arr = sort(in);

		int sum = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			if (sum >= in.length / 2)
				return i;
		}
		
		return -1;
	}
}
