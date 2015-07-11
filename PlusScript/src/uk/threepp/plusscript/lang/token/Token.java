package uk.threepp.plusscript.lang.token;

public class Token {

	private String tokenText;
	
	public Token(String tokenText) {
		
		setTokenText(tokenText);
	}

	public String getTokenText() {
		return tokenText;
	}

	public void setTokenText(String tokenText) {
		this.tokenText = tokenText;
	}
}
