package uk.threepp.plusscript.lang.token;

import java.util.ArrayList;

/**
 * Takes in some PlusScript code and will output the tokenised code. 
 */
public class Tokeniser {

	private String code;
	private String cache;
	private ArrayList<Token> tokens;
	
	public Tokeniser(String code) {
		
		setCode(code);
		cache = "";
		tokenise();
	}

	private void tokenise() {
		
		/*
		 * 1. Add ONE new character to the cache from 'code'.
		 * 
		 * 2. Check the cache for any keywords that we understand.
		 * 
		 * 3. Output the keywords as Tokens to the ArrayList.
		 */
		
		while (cache.length() < code.length()) {
			
			cache += code.charAt(cache.length());
			
			//TODO Check cache for any keywords or objects we understand.
			
			//TODO Add these tokens to the ArrayList using tokens.add(new Token(cache));
		}
		
		System.out.println(cache);
		
		tokens = new ArrayList<Token>();
		tokens.add(new Token("Hello, World!"));
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ArrayList<Token> getTokens() {
		return tokens;
	}

	public void setTokens(ArrayList<Token> tokens) {
		this.tokens = tokens;
	}
}
