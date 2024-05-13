package labs4;

import java.util.Arrays;
public class Question4 {
	
	    public static void bubbleSort(char[] arr) {
	        int n = arr.length;
	        boolean swapped;

	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    char temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if(!swapped) {
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        char[] alphabetArray = {'d', 'b', 'a', 'c', 'j', 'e'};//you can write ur characters here in the format u can see in the left
	        System.out.println("Original array: " + Arrays.toString(alphabetArray));

	        bubbleSort(alphabetArray);

	        System.out.println("Sorted array: " + Arrays.toString(alphabetArray));
	    }
	}


