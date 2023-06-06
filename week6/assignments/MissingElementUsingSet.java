package week6.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingElementUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = { 1, 2, 3, 4, 6, 7, 8, 1, 2, 3 };
		Set<Integer> uniqueNo = new LinkedHashSet<Integer>();
		for (int i = 0; i < number.length; i++) {
			uniqueNo.add(number[i]);
		}
		System.out.println(uniqueNo);
		List<Integer> missingElement = new ArrayList<Integer>(uniqueNo);
		System.out.println(missingElement);
		int size = missingElement.size();
		//System.out.println(size);
		for (int i = 0; i <=size; i++) {
			if (!missingElement.contains(i+1)) {
				System.out.print(i+1);
				break;
			}
			
		}
		
		
	}

}
