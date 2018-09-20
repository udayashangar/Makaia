package practise;

import java.util.Scanner;

public class Factoring {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int fact = 1;
		
		/*for(int i=n; i>0;i--)
		{
			fact = fact*i;
		}
		*/
		
		while(n>0) {
		fact =fact*n;
		n--;
		}
		
		System.out.println(fact);
	}

}
