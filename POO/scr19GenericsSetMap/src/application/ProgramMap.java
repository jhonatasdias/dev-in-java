package application;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@email.com");
		cookies.put("phone", "991558899");
		
		cookies.remove("email");
		cookies.put("phone", "985228514");
		
		System.out.println("All Cookies");
		
		
		for(String key : cookies.keySet()) {
			System.out.println( key + ": " + cookies.get(key) );
		}
	}

}
