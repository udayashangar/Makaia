package learn.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {

		String cmp = "Sarumathi";
		System.out.println("Given String: " +cmp);
		cmp = cmp.toLowerCase();
		System.out.println("In Lowercase: "+cmp);
		char[] charArray = cmp.toCharArray();

		Map<Character,Integer> map = new LinkedHashMap<>();

		for (char eachChar : charArray) {

			if(map.containsKey(eachChar)) {
				map.put(eachChar, map.get(eachChar)+1);
			}else
			{
				map.put(eachChar, 1);
			}


		}System.out.print(map);
		System.out.println();
		System.out.println(map.entrySet());
		/*for (Map<Character,Integer> obj : map) {
			
			
		}
		if(map.get(char))
*/
	}

}
