import java.io.*;
import java.util.*;

public class main {
	
	public static void main(String[] args)
	{
		try
		{
			File txt = new File("H:/Downloads/missingdata.txt");
			Scanner scan = new Scanner(txt);
			ArrayList<Integer> data1 = new ArrayList<Integer>() ;
			int count1 = scan.nextInt();
			int max1 = Integer.MIN_VALUE;
			for (int i = 1; i <= count1; i++)
			{
				int k = scan.nextInt();
				data1.add(k);
				
				if (k > max1)
				{
					max1 = k;
				}
			}
			
			System.out.println("First list has length " + data1.size());
			System.out.println(data1);
			ArrayList<Integer> data2 = new ArrayList<Integer>() ;
			int count2 = scan.nextInt();
			int max2 = Integer.MIN_VALUE;
			for (int i = 1; i <= count2; i++)
			{
				int k = scan.nextInt();
				data2.add(k);
				
				if (k > max2)
				{
					max2 = k;
				}
			}
			
			System.out.println("Second list has length " + data2.size());
			System.out.println(data2);
			
			int[] temp1 = sort(data1.toArray(new Integer[data1.size()]), max1);
			int[] temp2 = sort(data2.toArray(new Integer[data2.size()]), max2);
			
			int[] difference = missingNumber(temp1, temp2);
			System.out.print("The difference is ");
			
			for (int i = 0; i < difference.length; i++)
			{
				System.out.print(difference[i] + " ");
			}
	
			scan.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
	
	
		}
	}
	
	public static int[] sort(Integer[] arr, int k)
	{
		int n = arr.length;
		
		int count[] = new int[10000];
		
		for (int i = 0; i < n; i++)
		{
			count[arr[i]]++;
		}
	
		return count;
	}
	
	public static int[] missingNumber(int[] missing, int[] original)
	{
		int nummiss = 8;
		int counter = 0;
		
		int[] missnums = new int[nummiss];
		
		for (int i = 0; i < original.length; i++)
		{
			if (original[i] != missing[i])
			{
				missnums[counter] = i;
				counter++;
			}
		}
		
		return missnums;
	}
}
