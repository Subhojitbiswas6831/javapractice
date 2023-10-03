package Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Javastreams {
	public static void main(String[] args) {

		Javastreams j = new Javastreams();
		// j.streamFilter();
		j.Streammap();

		j.StreamCollect();
	}

	public void regulartest() {
		// TODO Auto-generated method stub
		// COunt the number of name starting with a
		ArrayList<String> name = new ArrayList<String>();
		name.add("ajay");
		name.add("abhishek");
		name.add("rajat");
		name.add("akhil");
		name.add("isac");
		int count = 0;

		for (String x : name) {
			if (x.startsWith("i")) {
				System.out.println(x);
				count++;

			}
		}
		System.out.println(count);

	}

	public void streamFilter() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("ajay");
		name.add("abhishek");
		name.add("rajat");
		name.add("akhil");
		name.add("isac");
		long count1 = name.stream().filter(s -> s.startsWith("a")).count();
		System.out.println(count1);
		Stream.of("ajay", "abhishek", "rajat", "akhil", "isac").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		name.stream().filter(d -> d.length() > 4).forEach(d -> System.out.println(d));
		name.stream().filter(d -> d.length() > 4).limit(1).forEach(d -> System.out.println(d));

	}

	@Test
	public void Streammap() {
		SoftAssert sa = new SoftAssert();
		ArrayList<String> name = new ArrayList<String>();
		name.add("ajay");
		name.add("abhishek");
		name.add("rajat");
		name.add("akhil");
		name.add("isac");
		// print names with greater 4 letters for uppercase
		// Stream.of("raju", "ashok", "abhishek",
		// "ram").filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		// print names which has fist letter as a with upper case and sorted;
		String[] name1 = { "roop", "hello", "shopping", "Antman", "sapiderman" };
		List<String> list = Arrays.asList(name1);
		list.stream().filter(s -> s.startsWith("s")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		Stream<String> concatlist = Stream.concat(name.stream(), list.stream());
		// concatlist.sorted().forEach(s->System.out.println(s));
		boolean check = concatlist.anyMatch(s -> s.equalsIgnoreCase("isac"));

		Assert.assertTrue(check);

	}

	@Test
	public void StreamCollect() {
		List<String>ls= Stream.of("ajat", "abhishek", "rajat", "akhil", "isac").filter(s->s.endsWith("t")).map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
	List<Integer>names1 = Arrays.asList(3,4,4,5,6,7,7,8,9);
	//Print the unique numbers from this array 
	
	//sort the numbers
	List<Integer> li=names1.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(li.get(2));
	Object[] objects = li.toArray();
	System.out.println(objects.length);


	

}
}
