package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramCopyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		
		
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object item : list) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}

}
