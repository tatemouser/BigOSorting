package main;

import java.util.Scanner;
import sortMethods.*; 

// TODO: Add time it takes to perform each search.
public class Index {
	public static void start(int size, String type, String methodType) {
		System.out.println("Starting Sort, Before:");
		CreateElements create = new CreateElements();
		
		if(type.equals("Integer")) 	{ 
			Integer[] array = create.IntegerArray(size); 
		
			if(methodType.equals("InsertionSort")) {
				InsertionSort temp = new InsertionSort();
				temp.printIntegers(array); // Before
				temp.sortIntegers(array);
				System.out.println("Sort Complete, After:");
				temp.printIntegers(array); // After
			}
			
			if(methodType.equals("BubbleSort")) {
				BubbleSort temp = new BubbleSort();
				temp.printIntegers(array);
				temp.sortIntegers(array);
				System.out.println("Sort Complete, After:");
				temp.printIntegers(array);
			}
			
			if(methodType.equals("QuickSort")) {
				QuickSort temp = new QuickSort();
				temp.printIntegers(array);
				temp.sortIntegers(array, 0, array.length-1);
				System.out.println("Sort Complete, After:");
				temp.printIntegers(array);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO: Create
		// TODO: Run
		// TODO: Print
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("How many elements would you like to sort?");
		int size = stdin.nextInt();
		
		System.out.println("What type of elements would you like to sort?");
		String type = stdin.next();
		
		System.out.println("What sort method would you like to use?");
		String methodType = stdin.next();
		
		start(size, type, methodType);	
	}
}
