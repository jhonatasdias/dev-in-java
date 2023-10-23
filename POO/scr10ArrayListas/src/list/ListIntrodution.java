package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListIntrodution {
	
	static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		for(String listElement : list) {
			System.out.println(listElement);
		}
		
		System.out.println("---------------------------");
		
		// Interface Predicate<T> = the predicate return true or false
		// This is a functional interface and can therefore be used as the assignment target 
		// for a lambda expression or method reference.
		
		list.removeIf( m -> m.charAt(0) == 'M' );
		
		for(String listElement : list) {
			System.out.println(listElement);
		}
		
		System.out.println("---------------------------");
		
		List<String> result = list.stream().filter( m -> m.charAt(0) == 'A' ).collect(Collectors.toList());
		
		for(String listElement : result) {
			System.out.println(listElement);
		}
		
		System.out.println("---------------------------");
		
		String name = list.stream().filter( m -> m.charAt(0) == 'A' ).findFirst().orElse(null);
		
		System.out.println(name);
		
		String name2 = list.stream().filter( m -> m.charAt(0) == 'J' ).findFirst().orElse(null);
		
		System.out.println(name2);
	}
}
