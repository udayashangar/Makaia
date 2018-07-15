package practise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class StringDupicate {
@Test
	public void stringDuplicate() {
		System.out.println("Enter the Word to Remove Duplicate Chars");
		
		Scanner scanObj = new Scanner(System.in);
		String word = scanObj.nextLine();
		//System.out.println(word);
		String a="";
		char[] wChar = word.toLowerCase().replace(" ","").toCharArray();
		int l= wChar.length;
		//Set<String> setWord = new HashSet();
		for(int i=0; i<l; i++)
		{
			if(!a.contains(wChar[i]+"")) {
				a=a+wChar[i];				
			}
				
		}System.out.print(a);
		
		
		
		
		
	}
	
}
