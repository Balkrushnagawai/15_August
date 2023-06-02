package logical_Program;

import java.util.Arrays;

public class String_Anagram {
	public static void main(String[] args) {
		//Anagram String
		String a1="Horse";
		String a2="Shore";
		//1.lowerCase
		//2.StringToArray
		//3.sort-->a1 sort-->a2
		//4.compare-->True -->Anagram
		char[] arrayofA1 = a1.toLowerCase().toCharArray();
		char[] arrayofA2 = a2.toLowerCase().toCharArray();
		Arrays.sort(arrayofA1);
		Arrays.sort(arrayofA2);
		if(Arrays.equals(arrayofA1, arrayofA2))
		{
			System.out.println("String "+a1+ " and String "+a2+ " are Anagram");
		}
		else
		{
			System.out.println("String "+a1+ " and String "+a2+ " are Not Anagram");
		}
		
	}

}
