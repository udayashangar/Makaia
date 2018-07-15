package practise;

public class CountDigit {

	public static void main(String[] args) {
	
		String s ="123KK";
		int count =0;
		int l=s.length();
		for (int i = 0; i < l; i++) {
			if(Character.isLetterOrDigit(s.charAt(i)) ) {
			count++;
			
			}

		}System.out.println(count);
		if(count==5) {
			System.out.println("True");
		}else
		{
			System.out.println("False");
		}
	}
}
