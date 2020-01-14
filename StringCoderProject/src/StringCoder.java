import java.util.*;
public class StringCoder {

	private String masterString;
	
	public StringCoder(String master)
	{
		masterString = master;
	}
	
	public String decodeString(ArrayList<StringPart> parts)
	{
		StringBuilder sb = new StringBuilder();
		for (StringPart s : parts)
		{
			int end = s.getStart() + s.getLength();
			sb.append(masterString.substring(s.getStart(), end));
		}
		return sb.toString();
	}
	
	private StringPart findPart(String str)
	{
		if (masterString.contains(str))
		{
			return new StringPart(masterString.indexOf(str), str.length());
		}
		return null;
	}
	
	public ArrayList<StringPart> encodeString(String word)
	{
		ArrayList<StringPart> list = new ArrayList<StringPart>();
		int length = word.length();
		int start = 0;

		while (start != length)
		{
			for (int i = length; i >= 0; i--)
			{
				StringPart part = findPart(word.substring(start, i));
				if (part != null)
				{
					list.add(part);
					start += part.getLength();
					break;
				}
			}
		}
		return list;
	}
}
