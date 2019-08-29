import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class NumberSorter {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		List<Double> numbers = new ArrayList();
		System.out.printf("Enter 3 numbers: ");
		for(int i = 0; i < 3; i++)
		{
			numbers.add(Double.parseDouble(getInput()));
		}
		Collections.sort(numbers);
		for(int i = 0; i < 3; i++)
		{
			System.out.printf("%s, ", numbers.toArray()[i].toString());
		}
	}
    public static String getInput()  
    {
        return stdin.nextLine();
    }
}
