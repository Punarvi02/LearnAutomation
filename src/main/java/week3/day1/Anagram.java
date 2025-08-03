package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		
		int text1Length = text1.length();
		int text2Length = text2.length();
		
		if(text1Length == text2Length) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			 Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			if(Arrays.equals(charArray1, charArray2)) {
				System.out.println("The given strings are Anagram");
			}
			else System.out.println("The given string are not an Anagram");
			
		}
		else
		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");

	}

}
