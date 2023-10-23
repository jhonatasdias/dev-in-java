package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App4 {

	public static void main(String[] args) {

		String[] text = {"Good Morning", "Good Afternoon", "Good Night"};

		String path = "out.txt";
		
		// if you would you like the increment in the file use (path, true)
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for( String line : text ) {
				bw.write(line);
				bw.newLine();
			}
		}catch( IOException e ) {
			System.out.println( e.getMessage() );
		}
	}

}
