package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachMethodDemo {
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(55,44,88,99,55,66);
		
		System.out.println("using for each loop");
		for(int x: list) {
			System.out.println(x);
		}
		System.out.println("Using ForEach() method with lamda expressions from java version8");
		Consumer<Integer> consumer = (element) -> System.out.println(element);
		list.forEach(consumer);
		
		System.out.println("Using ForEach() method with Method References from java version8");
		Consumer<Integer> consumer2 = System.out :: println;
		list.forEach(consumer2);
		
		System.out.println("Using ForEach() method with lamda expressions from java version8");
		list.forEach((element) -> System.out.println(element));
		
		System.out.println("Using ForEach() method with Method References from java version8");
		list.forEach(System.out :: println);
		
		System.out.println(list);
		
		//filter only even numbers
		System.out.println("using for each loop");
		for(int element: list) {
			if(element%2==0) {
				System.out.println(element);
			}
		}
		list.forEach(element -> {
			if(element%2==0) {
				System.out.println(element);
			}
		});
		System.out.println("Using filter() method using Stream API ");
		Predicate<Integer> predicate = (element) -> element%2==0;
		list.stream()
		.filter(predicate)
		.forEach(System.out :: println);
	
		System.out.println("Using filter() method using Stream API ");
		list.stream()
		.filter((element) -> element % 2==0)
        .forEach(System.out :: println);
	}}



