package practise;

import org.testng.annotations.Test;

public class StaticPractise {

	static String hello = "Hello";
	 String world = "World";
	
	 @Test
	 public void call() {
		sMethod();
		nMethod();
		
	}
	 
	
	public static void sMethod() {
	
		StaticPractise obj = new StaticPractise();
		System.out.println(hello +obj.world);
	}
	
	public void nMethod() {
		
		System.out.println(hello +world);
	}
	
	
}
