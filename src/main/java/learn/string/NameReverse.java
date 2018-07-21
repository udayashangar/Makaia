package learn.string;

public class NameReverse {
	static String name="My name is Udayashangar";
	public static void main(String[] args) {
		
		System.out.println("My Name:"+name);
		System.out.println("Reverse:");
		
		NameReverse obj = new NameReverse();
			obj.method1();
			method2();
			method3();
		}
		
		//Method 1
		public void method1() {
			System.out.println("Method1 :");
			
			int l = name.length();
		for(int i=l-1; i>=0; i--) {
		System.out.print(name.charAt(i));
		}
		System.out.println();
		}
		
		//Method 2
		public static void method2() {
			System.out.println("Method2 :");
			
			char[] charArray = name.toCharArray();
			int arrLength = charArray.length;
			
			for(int i=arrLength-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}	System.out.println();
		}
		//Method 3
		public static void method3() {
			System.out.println("Method3 :");
			
		StringBuilder n = new StringBuilder("My name is Udayashangar");
		StringBuilder reverseName = n.reverse();
		
		System.out.println(reverseName);
		
		}
}