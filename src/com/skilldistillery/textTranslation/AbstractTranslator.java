package com.skilldistillery.textTranslation;

public abstract class AbstractTranslator implements Translator {
	
	public AbstractTranslator() {
		super();
	}
	@Override
	public String translateText(String s) {
		if(s.charAt(s.length()-1)!='.') {
			s+=".";
		}
		String [] splitArr= s.substring(0,s.length()-1).split(" ");
		StringBuilder output = new StringBuilder();
		for (int i=0; i<splitArr.length; i++) {
			if (i==splitArr.length-1) {
				output.append(translateWord(splitArr[i]));
				output.append(".");
			}else {
				output.append(translateWord(splitArr[i]));
				output.append(" ");
			}
		}
		return output.toString();
	}
	
	public abstract String translateWord(String s);

}
