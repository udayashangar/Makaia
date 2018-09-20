package practise;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s ="Welcome to Selenium Automation";
		
		String[] str = s.split("\\s");
		
		String word="";
		
		for (String e : str) {
			StringBuffer sb = new StringBuffer(e);
			
			StringBuffer val = sb.reverse();
			System.out.print(val+" ");
			
		}

	}

}
