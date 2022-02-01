package day33_stringBuilder;

import java.util.Scanner;

public class C09_SoruString {

	Scanner input = new Scanner(System.in);
	String   text = input.nextLine();
	// kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter text to find the number 'b' in the text:");
		String input=scan.nextLine();
		countLettersb(input, 'b'); // System.out.println(countLettersb(input,'b'));
		System.out.println("Input contains "+(countLettersb(input, 'b'))+ " 'b' letters");
	}
	public static int countLettersb(String text, char letter) {
		int piece = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == letter)
				piece++;
		}
		return piece;
	}

}
