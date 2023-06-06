package week6.assignments;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestFinder {
    public static void main(String[] args) {
    	int[] number = { 10, 5, 20, 15, 25, 30 };
    	List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < number.length; i++) {
			numbers.add(number[i]);
		}

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : uniqueNumbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("The second-largest element is: " + secondLargest);
    }
}
