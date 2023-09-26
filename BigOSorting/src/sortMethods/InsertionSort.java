package sortMethods;

public class InsertionSort {
	public void printIntegers(Integer[] temp) {
		for(Integer val: temp) {
			System.out.println(val);
		}
	}
	
	/**
	 * 	Consist of sorted array and unsorted array. Sorted at front.
	 * 	One element is added to sorted array and placed in correct order.
	 * 	Continue until sorted array = array size.
	 * 
	 * 	O(n^2) occurs when an array is descendingly sorted prior Ex: [9 6 3 3 2 1 1]
	 */
	public void sortIntegers(Integer[] elements)  {
		// Loop used to restart from end of sorted array. Updating i.
		for(int i = 1; i < elements.length; i++) {
			
			int j = i - 1;

			Integer current = elements[i];
			
			// Voids start and loops until previous is less than current
			while(j >= 0 && elements[j].compareTo(current) > 0) { // CompareTo Ex: 8,9 = 1 or 9,8 = -1
				elements[j+1] = elements[j]; // Shift back current
				j--;
			}
			// Place element
			elements[j+1] = current;
		}
	}
}







