package practise;

public class NumReverse {

	public static void main(String[] args) {
		
		/*String numberAsString = new Integer(-123).toString();
		StringBuilder str = new StringBuilder(numberAsString);
		StringBuilder rev = str.reverse();
		System.out.println(rev);*/
		
		int n=123;
		System.out.println("Original num: "+ n);
		int temp;
		int rev=0;
		
		while(n>0) {
			temp = n%10;
			rev = (rev*10)+temp;
			n = n/10;
		}
		System.out.println("Reverse num:"+rev);

	}

}
