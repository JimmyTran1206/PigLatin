package com.skilldistillery.textTranslation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatinTranslator extends AbstractTranslator {
	public PigLatinTranslator() {
		super();
	}
	
	public static void main(String[] args) {
		PigLatinTranslator pt=new PigLatinTranslator();
		String s = pt.translateWord("sshc,");
		System.out.println(s);
	}

	@Override
	public String translateWord(String s) {
		// if null return null
		if(s==null) {
			return null;
		}
		
		// if not null, do the following:
		StringBuilder output= new StringBuilder();
		Pattern p=Pattern.compile("(^[^aeiou|^AEIOU]*)(\\w*)");
		Matcher m = p.matcher(s);
		if(m.find()) {
			String str1= m.group(1);
			String str2= m.group(2);

			if(str2.equals("")) {
				output.append(str1);
				output.append("ay");
				return output.toString();			
			}
			
			if(str1.equals("")) {
				output.append(str2);
				output.append("way");
			}else {
				if(str1.charAt(0)>='A'&&str1.charAt(0)<='Z') {
					str1=str1.toLowerCase();
					str2=capitalizeFirstLetter(str2);
				}
				output.append(str2);
				output.append(str1);
				output.append("ay");
			}
		}
		return output.toString();
	}
	
	public String capitalizeFirstLetter(String word) {
		return Character.toUpperCase(word.charAt(0))+ word.substring(1).toLowerCase();
	}
	
}
