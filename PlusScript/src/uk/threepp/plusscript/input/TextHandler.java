package uk.threepp.plusscript.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TextHandler {

	private Reader reader;
	
	public TextHandler() {
	}
	
	public char[] cacheFile(String fname) {

		System.out.println("\nLoading file \"" + fname.trim() + "\"...");
		try {
			
			reader = new FileReader(fname);
			char[] cbuf = new char[]{};
			reader.read(cbuf);
			return cbuf;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			return null;
			
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}
	}
}
