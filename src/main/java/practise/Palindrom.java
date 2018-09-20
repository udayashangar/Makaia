package practise;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String s = obj.nextLine();
		int length = s.length();
		
		String rev= "";
		for(int i=length-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		 if(s.equalsIgnoreCase(rev)) {
			 System.out.println("Palindrom");
		 }else {
			 System.out.println("Not Palindrom");
		 }
	}

}
