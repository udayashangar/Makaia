package practise;

public class SubString {

	public static void main(String[] args) {
		String fword, sword, fullword;
		
		String s = "royal bank of scotland";

		String[] str = s.split("\\s");
		
		for (String e : str) {
			fword = e.substring(0, 1);
			sword = e.substring(1);
			fullword = fword.toUpperCase()+sword;
			System.out.print(fullword+" ");
			
			fullword = fword.toLowerCase()+sword.toUpperCase();
			System.out.print(fullword+" ");
			
			/*System.out.println(fword);
			System.out.println(sword);*/
		}
	}

}
