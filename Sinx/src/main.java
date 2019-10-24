import java.util.Scanner;
public class main {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
        float a = (float) (Float.parseFloat(stdin.nextLine()) * Math.PI) / 180;
        int t = Integer.parseInt(stdin.nextLine());
        
        System.out.println("Sin: " + sinx(a, t));
        System.out.println("Cos: " + cosx(a, t));
	}
	
	public static float sinx(float a, int t)
	{
        float y = 0;
        for (int i = 0; i <= t; i++)
        {
            y += (float) ( (-1) * ((Math.pow(-1, i + 1) * Math.pow(a, 2 * i + 1))/factorial(2 * i + 1)));
        }
        return y;
	}
	
	public static float cosx(float a, int t)
	{
        float y = 0;
        for (int i = 0; i <= t; i++)
        {
            y += (float)((-1) * ((Math.pow(-1, i + 1) * Math.pow(a, 2 * i)) / factorial(2 * i)));
        }
        return y;
	}
	
	public static float factorial(float n)
	{

	    if (n == 1 || n == 0)
	    {
	        return 1;
	    }
	    else
	    {
	        return n * factorial(n - 1);
	    }
	}

}
