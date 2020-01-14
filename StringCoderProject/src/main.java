import java.util.*;
public class main {
	public static void main(String[] args) {
		String masterString = "sixtyzipperswerequicklypickedfromthewovenjutebag";

		StringCoder coder = new StringCoder(masterString);

		ArrayList<StringPart> parts = coder.encodeString("overeager");

		for (StringPart part : parts)
		{
		System.out.println("The string part is " + masterString.substring(part.getStart(), part.getStart() + part.getLength()));
		}

		String newString = coder.decodeString(parts);

		System.out.println();
		System.out.println("The original string is " + newString);
	}

}
