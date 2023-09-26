package main;
import java.util.Random;

public class CreateElements {
	
	public Integer[] IntegerArray(int size) {
		Random random = new Random();
		Integer[] elements = new Integer[size];
		for(int i = 0; i < elements.length; i++) elements[i] = random.nextInt(size); 
		return elements;
	}
}
