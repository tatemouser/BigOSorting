package sortMethods;

public class BubbleSort {
	public void printIntegers(Integer[] temp) {
		for(Integer val: temp) {
			System.out.println(val);
		}
	}
	
	/**
	 * 	Consist of sorted array and unsorted array. Sorted at end.
	 * 	One element is added to front of sorted array each iteration.
	 * 	Continue iterating from start of unsorted to start of sorted array until unsorted is empty.
	 * 
	 * 	O(n^2) occurs when an array is descendingly sorted prior Ex: [9 6 3 3 2 1 1]
	 */
	public void sortIntegers(Integer[] elements) {
		// Iterate entire array, incrementing sorted array after i increments
		for(int i = 0; i < elements.length-1; i++) { 
			
			for(int j = 1; j < elements.length-i; j++) {
				// If arr[1] is larger than arr[2]
				if(elements[j-1].compareTo(elements[j]) > 0) { // 8,9 = 1 or 9,8 = -1
					// Swap arr[1] with arr[2]
					Integer temp = elements[j];
					elements[j] = elements[j-1];
					elements[j-1] = temp;
				}
			}
		}
	}
}
