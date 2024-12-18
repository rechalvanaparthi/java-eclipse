package collections;

import java.util.Comparator;
import java.util.TreeSet;

/*TreeSet:
  1.Order of the sequence will be maintained 
  2.Duplicates are not allowed
  
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> h = new TreeSet<Integer>();
		h.add(100);
		h.add(400);
		h.add(300);
		h.add(200);
		h.add(500);
		System.out.println(h);
		
		TreeSet<Integer> ts = new TreeSet<Integer>(Comparator.reverseOrder());
		ts.add(100);
		ts.add(400);
		ts.add(300);
		ts.add(200);
		ts.add(500);
		System.out.println(ts);
		
		TreeSet<String> t = new TreeSet<String>();
		t.add("Java");
		t.add("Python");
		t.add("React");
		t.add("Angular");
		t.add("Js");
		System.out.println(t);
		
		
		//Traversal
		for(String course : t) {
			System.out.println(course);
		}
		for(int price : ts) {
			System.out.println(price);
		}
	}

}
