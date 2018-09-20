package practise;

import java.util.Scanner;

public class Fibinacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		Scanner obj = new Scanner(System.in);
		int count = obj.nextInt();
		System.out.print(a + ","+b);
		
		for(int i=1; i<count;i++) {
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}

	}

}
