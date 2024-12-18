package collections;


import java.util.ArrayList;

/*
 Array List
 --------
 Maintain Insertion
 Duplicates are allowed
 */
public class ArrayListDemo {
	
	public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	System.out.println(a1.size());
	
	//adding
	a1.add(100);
	a1.add(200);
	System.out.println(a1.size());
	System.out.println(a1);
	
	a1.add("Java");
	a1.add("Python");
	System.out.println(a1.size());
	System.out.println(a1);
	
	a1.add(2, "Angular");
	System.out.println(a1.size());
	System.out.println(a1);
	
	//Updating
	a1.set(0, 1000);
	System.out.println(a1.size());
	System.out.println(a1);
	
	//Removing
	a1.remove(0);
	System.out.println(a1.size());
	System.out.println(a1);
	
	//get------> to find out the element present in array
	System.out.println(a1.get(0));
	System.out.println(a1.get(2));
	System.out.println(a1.get(a1.size()-1));
	//System.out.println(a1.size()-1); -------> to get the index size
	
	//removing all elements
	a1.clear();
	System.out.println(a1.size());
	System.out.println(a1);
	}

}
