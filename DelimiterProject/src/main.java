
public class main {

	public static void main(String[] args) {
	
		Delimiters del = new Delimiters("(", ")");
		System.out.println(
				del.isBalanced(
				del.getDelimitersList(
						new String[] {"(", "x + y", ")",  " * 5"}
				)) + " | true");
		
		del = new Delimiters("<q>", "</q>");
		System.out.println(
				del.isBalanced(
				del.getDelimitersList(
						new String[] {"<q>", "yy", "</q>", "zz", "</q>"}
				)) + " | false");
		
		del = new Delimiters("<sup>", "</sup>");
		System.out.println(
				del.isBalanced(
				del.getDelimitersList(
						new String[] {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"}
				)) + " | true");
		
		del = new Delimiters("<sup>", "</sup>");
		System.out.println(
				del.isBalanced(
				del.getDelimitersList(
						new String[] {"<sup>", "</sup>", "</sup>", "<sup>"}
				)) + " | false");
		
		del = new Delimiters("<sup>", "</sup>");
		System.out.println(
				del.isBalanced(
				del.getDelimitersList(
						new String[] {"</sup>"}
				)) + " | false");
		
		del = new Delimiters("<sup>", "</sup>");
		System.out.println(
				del.isBalanced(
				del.getDelimitersList(
						new String[] {"<sup>", "<sup>", "</sup>"}
				)) + " | false");
	}

}
