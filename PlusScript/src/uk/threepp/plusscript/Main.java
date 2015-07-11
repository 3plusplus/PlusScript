package uk.threepp.plusscript;

import java.util.ArrayList;

import uk.threepp.plusscript.input.TextHandler;
import uk.threepp.plusscript.lang.token.Token;
import uk.threepp.plusscript.lang.token.Tokeniser;

public class Main {

	private static String banner;
	private static String fname;
	private static String fileContents;
	
	private static Tokeniser tokeniser;
	private static ArrayList<Token> tokens;
	
	private static TextHandler textHandler;
	
	public static void main(String[] args) {
		
		banner = "###########################"
				+ "\n\n"
				+ "PlusScript Interpreter v1.0"
				+ "\nCopyright 3++ 2015"
				+ "\n\n"
				+ "###########################"
				+ "\n";
		
		fname = "";
		for (String s : args) {
			
			fname += s + " ";
		}
		
		System.out.println(banner);
		
		textHandler = new TextHandler();
		
		if (fname != "") {
			
			fileContents = textHandler.cacheFile(fname);
			if (fileContents != null) System.out.println(fileContents);
			
			tokeniser = new Tokeniser(fileContents);
			tokens = tokeniser.getTokens();
			
			for (Token t : tokens) System.out.println(t.getTokenText());
		}
	}
}
