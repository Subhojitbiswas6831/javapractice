package Framework;

import java.awt.Frame;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]s = {"roop","paul","String"};
		
		
		Set<String > set = new HashSet<String>();
		
		
		System.out.println(set);
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
		
		System.out.println(i.next());
		
		

	}
		
		for(String s1:s) {
			if(set.add(s1)) {
				System.out.print(s1+",");
			}
		}

}
}
