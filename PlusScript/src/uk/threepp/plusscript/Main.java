package uk.threepp.plusscript;

import uk.threepp.plusscript.input.TextHandler;

public class Main {

	private static String banner;
	private static String fname;
	private static char[] fileContents;
	private static TextHandler textHandler;
	
	public static void main(String... args) {
		
		banner = "###########################"
				+ "\n\n"
				+ "PlusScript Interpreter v1.0"
				+ "\nCopyright 3++ 2015"
				+ "\n\n"
				+ "###########################";
		
		fname = "";
		for (String s : args) {
			
			fname += s + " ";
		}
		
		System.out.println(banner);
		
		textHandler = new TextHandler();
		
		if (fname != "") {
			
			fileContents = textHandler.cacheFile(fname);
			if (fileContents != null) System.out.println(fileContents);
		}
	}
}
