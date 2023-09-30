package sortMethods;

public class QuickSort {
	public void printIntegers(Integer[] temp) {
		for(Integer val: temp) {
			System.out.println(val);
		}
	}

	public Integer[] swapIntegers(Integer[] elements, int left, int right) {
	    Integer temp = elements[left];
	    elements[left] = elements[right];
	    elements[right] = temp;
	    return elements;
	}
	

	
	/*
	 * Sets pivot element, and sets left and right accordingly.
	 * Begins loop to move left and right to location where they are less than 
	 * and greater than the partition. These are then swapped.
	 * The pivot at the start is then swapped with the right pointer.
	 * Pivot is then moved out of start and to right pointer.
	 * Repeat until sorted.
	 */
	public int partition(Integer[] elements, int start, int end) {
	    Integer pivot = elements[start];
	    int left = start + 1;
	    int right = end;

	    while (left <= right) {
	        while (left <= right && elements[left].compareTo(pivot) <= 0) { left++; }
	        while (left <= right && elements[right].compareTo(pivot) > 0) { right--; }

	        if (left <= right) {
	            elements = swapIntegers(elements, left, right);
	            left++;
	            right--;
	        }
	    }
	    elements = swapIntegers(elements, start, right);
	    return right;
	}
	
	/**
	 * 
	 * @param start = 0 on first call
	 * @param end = temp.length on first call
	 */
	public void sortIntegers(Integer[] elements, int start, int end) { 
		if(end - start > 0) {
			int pivotIndex = partition(elements, start, end);
			sortIntegers(elements, start, pivotIndex-1);
			sortIntegers(elements, pivotIndex+1, end);
		}
	}
}
