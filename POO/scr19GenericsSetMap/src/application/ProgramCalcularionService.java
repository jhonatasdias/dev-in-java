package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class ProgramCalcularionService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		String path = "in.txt";
		
		try( BufferedReader br = new BufferedReader(new FileReader(path)) ){
			String ln = br.readLine();
			
			while(ln != null) {
				String[] fields = ln.split(",");
				list.add( new Product(fields[0], Double.parseDouble(fields[1])) );
				ln = br.readLine();
			}
			Product x = CalculationService.max(list);
			
			System.out.println(x.toString());
			
		}catch(Exception e) {
			
		}
		
	}

}
