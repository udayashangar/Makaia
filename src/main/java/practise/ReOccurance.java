package practise;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReOccurance {

	public static void main(String[] args) {
		String a = "Royal Bank of Scotland";
		char[] c = a.toCharArray();
		
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		char key;
		Integer val;
		
		for (char e : c) {
			if(m.containsKey(e)) {
				m.put(e,m.get(e)+1);
			}else
			{
				m.put(e, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> s = m.entrySet();
		Iterator <Map.Entry<Character, Integer>> itr = s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m2 =(Map.Entry) itr.next();
			
			key = (char) m2.getKey();
			val = (Integer) m2.getValue();
			System.out.println(key+":"+val);
			/*System.out.println(key);
			
			for (int i = 0; i < val; i++) {
				System.out.println(*);
			}*/
		}
		
	}

}
