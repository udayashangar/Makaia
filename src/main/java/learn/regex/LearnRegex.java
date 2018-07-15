package learn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {

	public static void main(String[] args) {
		String text = "Testleaf(9702)     Has   Number of   Employee20@!!";
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Question1:");
		System.out.println("Given String:"+text);
		System.out.println("Condition1: Only Alphabtes : "+"\""+text.replaceAll("\\d", "").replaceAll("\\W","")+"\"");
		System.out.println("Condition2: Only Numbers : "+"\""+text.replaceAll("\\D","")+"\"");
		System.out.println("Condition3: Only Special Charc  : "+"\""+text.replaceAll("\\w","")+"\"");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Question2:");

		System.out.println("Given String:"+text);
		//String p = "[\\s]{,}";
		System.out.println("Multple white space are removed: "+text.replaceAll("[\\s]+"," "));
		//System.out.println(text.replaceAll("[\\s]{1}",""));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Question3:");
		String text1 = "ABCD123E45F";
		System.out.println("Given String:"+text1);
		System.out.println("First 4 digits :"+text1.replaceAll("\\D+","").substring(0, 4)) ;
		System.out.println("----------------------------------------------------------------------------");


		/*		String text = "Testleaf89";
		String pattern = "[a-zA-Z0-9]{";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		System.out.println(m.matches());
		 */		

	}

}
