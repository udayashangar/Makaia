package learn.string;

import java.util.Scanner;

public class LowerToUpperCase {

	public static void main(String[] args) {


		String cmp="AMAZON";
		System.out.println("Given String is in Uppercase : "+cmp);
		char[] charArray = cmp.toCharArray();
		
		System.out.println("Lowercase of same string :");
		for (char eachChar: charArray) {
			int c = ((int)eachChar)+32;
			eachChar = (char)c;
			System.out.print(eachChar);

		}


		/*	char ch;
        int temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Character in Lowercase : ");
        ch = scan.next().charAt(0);

        temp = (int) ch;
        temp = temp - 32;
        ch = (char) temp;

        System.out.print("Equivalent Character in Uppercase = " +ch);*/
	}

}
