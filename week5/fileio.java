package week5;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class fileio {
	public static void main(String[] args) {
		
		// open file
		FileWriter fWriter = new FileWriter("./data/busReservation.txt");
		
		// open Buffer
		BufferedWriter out = new BufferedWriter(fWriter) ;
		
		out.write(null); out.newLine();
		out.close();
		fWriter.close();
		
	}
}
