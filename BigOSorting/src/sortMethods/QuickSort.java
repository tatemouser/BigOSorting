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
