package week3.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

//		 *Declare a String 
			String text1 = "stops";
//		 *Declare another String
			String text2 = "potss"; 
//		 * a) Check length of the strings are same then (Use A Condition)
			if (text1.length()==text2.length()) {
//				 * b) Convert both Strings in to characters				
				char[] text1Array = text1.toCharArray();
				char[] text2Array = text2.toCharArray();
//				 * c) Sort Both the arrays				
				Arrays.sort(text1Array);
				Arrays.sort(text2Array);
				System.out.println(text1Array);
				System.out.println(text2Array);
//				 * d) Check both the arrays has same value	
				if (Arrays.equals(text1Array,text2Array)) {
					System.out.println("it is an anagram");
					
				}else {
					System.out.println("it is not an anagaram");
				}
			}



	}

}
