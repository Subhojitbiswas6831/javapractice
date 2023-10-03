package Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String > set = new HashSet<String>();
		set.add("roop");
		set.add("paul");
		set.add("string");
		
		System.out.println(set);
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
		
		System.out.println(i.next());
		
		

	}

}
}
