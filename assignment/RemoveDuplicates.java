package week3.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";

		int count;
		String result="";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
		    String word = words[i];
		    
		    count = 0;

		    for (int j = 0; j < words.length; j++) {
		        if (word.equals(words[j])) {
		            count++;
		            if (count > 1) {
		                words[j] = "";
		            }
		        }
		    }
		    if (!word.equals(" ")) {
		        result =result + word + " ";
		    }
		}		
		System.out.println(result);
	}
}
