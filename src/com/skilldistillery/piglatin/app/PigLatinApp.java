package com.skilldistillery.piglatin.app;

import java.util.Scanner;

import com.skilldistillery.textTranslation.PigLatinTranslator;

public class PigLatinApp {
	private Scanner kb =new Scanner(System.in);
	private PigLatinTranslator plt= new PigLatinTranslator();
	public static void main(String[] args) {
		PigLatinApp pa= new PigLatinApp();
		pa.run();

	}
	
	public void run() {
		System.out.print("Enter a sentence: ");
		String userInput = kb.nextLine();
		String translatedText= plt.translateText(userInput);
		System.out.println("Original text: "+ userInput);
		System.out.println("Translated text: "+ translatedText);
		kb.close();
	}	
}
