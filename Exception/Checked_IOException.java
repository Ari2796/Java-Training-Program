//file not found or if found but the content is more then the size of file then it call io exception;;;;;
//if write anything in static file like(PDF) it wont change so it calls IO exception;;;;;

package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked_IOException {

	public static void main(String[] args) {
		try {
			FileReader r=new FileReader("not_found.txt");
			r.read();    // if i give fileNotFoundException then we unable to read or write the file 
			r.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
//		catch(FileNotFoundException e){
//			System.out.println(e.getMessage());
//		}
	}

}
