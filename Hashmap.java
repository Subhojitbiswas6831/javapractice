package Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.LineIteratorTest;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String , Integer> m=new HashMap<>();
		m.put("Russia", 20);
		m.put("China", 20);
		m.put("india", 40);
		
		Set s = m.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			
			Map.Entry mp = (Entry) i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}
}
