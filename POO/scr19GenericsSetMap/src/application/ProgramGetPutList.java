package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramGetPutList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		// Covariância
		Number x = list.get(0); // permitido
		
		list.add(20); // put não é permitido
		
		// Contravariância
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(15.35);
		
		Number x = myNums.get(0);
	}

}
