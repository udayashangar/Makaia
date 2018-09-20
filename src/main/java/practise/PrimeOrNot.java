package practise;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag =0;
		
		if(n%2==0) {
			flag++;
		}
		
		if(flag==0) {
			System.out.println("Prime Number");
		}else
		{
			System.out.println("Not Prime Number");
		}
		

	}

}
