package collections;


import java.util.ArrayList;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		//Normal ArrayList
	ArrayList a1 = new ArrayList();
	//adding
	a1.add(100);
	a1.add(200);
	a1.add("Java");
	a1.add("Python");
	a1.add(45000.0);
	a1.add(35000.0);
	System.out.println(a1);
	Object obj = a1.get(0);
	int x = (int) obj;
	System.out.println(x);
	
	//Generic Version of ArrayList  ---------> Type safety and avoids type casting
	ArrayList<Integer> subjectMarks = new ArrayList<Integer>();
	subjectMarks.add(44);
	subjectMarks.add(55);
	subjectMarks.add(66);
	subjectMarks.add(77);
	subjectMarks.add(88);
	subjectMarks.add(99);
	System.out.println(subjectMarks);
	
	int s1 = subjectMarks.get(0);
	System.out.println(s1);
	
	ArrayList<String> courseNames = new ArrayList<String>();
	courseNames.add("Java");
	courseNames.add("Python");
	courseNames.add("Angular");
	courseNames.add("ReactJS");
	courseNames.add("JS");
	System.out.println(courseNames);
	
	String c1 = courseNames.get(0);
	System.out.println(c1);
	}
}