package learn.string;

public class StringEquals {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1==s2)
		{
			System.out.println("s1==s2 is True");
		}else { 
			System.out.println("s1==s2 is False");
		}
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2) is True");
		}else { 
			System.out.println("s1.equals(s2) is False");
		}

		
		
		
		String s3="Hello";
		System.out.println(s3.hashCode());
		String s4="Hello1";
		System.out.println(s4.hashCode());
	}
}
