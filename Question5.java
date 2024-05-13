package labs5;
//Use mergesort to sort the numbers you entered in question 1 but it will not work unless this method is created in the firsr package i made
public class Question5 {
	
private static void mergeSort(int[] intArray) { int inputLength = intArray.length; 
	if(inputLength < 2) { 
	   return; 
	      } 
	
	int midIndex = inputLength / 2; 
	int[] leftHalf = new int[midIndex]; 
	int[] rightHalf = new int[inputLength - midIndex]; 
	for(int i = 0; i < midIndex; i++) { 
	leftHalf[i - midIndex] = intArray[i]; 
	} 
	  for(int i = midIndex; i < inputLength; i++) { rightHalf[i] = intArray[i]; 
	} 
	   mergeSort(leftHalf);
	    mergeSort(rightHalf); 
	//this is where Merge happens 
	merge(intArray, leftHalf, rightHalf); 
	} 
	private static void merge(int[] inputArray, int[]  leftH, int[] rightH) { 
	        int leftSize = leftH.length; 
	        int rightSize = rightH.length; 
	        int i = 0; 
	        int j = 0; 
	        int k = 0; 
	 
	while(i < leftSize && j < rightSize) { 
		if(leftH[i] <= rightH[j]) {inputArray[k] = leftH[i]; 
		i++; 
		} 
		else {inputArray[k] = rightH[j];
		} 
		k++; 
		} 
	while(i < leftSize) { inputArray[k] = leftH[i]; 
	i++; 
	k++; 
	} 
	while(j < rightSize) { 
		inputArray[k] = rightH[j]; 
		j++; 
		k++; 
	} 
	} 

}
