package labs;
import java.util.Scanner;

public class Question1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	               System.out.print("enter ur numbers with spaces:-");
	        String numbersInput = scanner.nextLine();
	        String[] numbersArray = numbersInput.split(" ");

	        int[] intArray = new int[numbersArray.length];
	        for (int i = 0; i < numbersArray.length; i++) {
	            intArray[i] = Integer.parseInt(numbersArray[i]);
	        }

	        System.out.print("enter  number to be searched:-");
	        int numtoSearch = scanner.nextInt();

	        int count = 0;
	        for (int number : intArray) {
	            if (number == numtoSearch) {
	                count++;
	            }
	        }
	        if (count > 0) {
	            System.out.println("number " + numtoSearch + " appears " + count + " times in the array.");
	        } else {
	            System.out.println("number " + numtoSearch + " is not in the array.");
	        }





	    }
}
