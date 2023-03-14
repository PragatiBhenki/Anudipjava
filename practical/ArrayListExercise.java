// Write a Java program to create a new array list, add some colors (string) and print out the collection. 
//
//2. Write a Java program to iterate through all elements in a array list
//
//3. Write a Java program to insert an element into the array list at the first position.
//
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//
//5. Write a Java program to remove the third element from a array list. 
//
//6. Write a Java program to search an element in a array list.
//
//7.Write a Java program to copy one array list into another. 
//
//8. Write a Java program to compare two array lists.

package CollectionsFramework;

//import required packages
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExercise {
	public static void main(String[] args) {

		// create a new ArrayList of Strings called "colors"
		ArrayList<String> colors = new ArrayList<>();

		// add some elements to the ArrayList
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("yellow");

		// print out the ArrayList
		System.out.println("Q1. " + colors);

		// create an Iterator to iterate over the elements of the ArrayList
		Iterator<String> itr = colors.iterator();

		// use the Iterator to print out each element of the ArrayList
		System.out.print("Q2. ");
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}

		// add an element to the beginning of the ArrayList
		colors.add(0, "cyan");
		System.out.println("\nQ3. " + colors);

		// find the index of an element in the ArrayList
		System.out.println("Q4. " + colors.indexOf("red"));

		// remove an element from the ArrayList and print out the updated ArrayList
		System.out.print("Q5. " + colors.remove(2) + " --> ");
		System.out.println(colors);

		// ask the user to input a color to search for in the ArrayList
		Scanner sc = new Scanner(System.in);
		System.out.print("Q6. Search Any Color: ");
		String search = sc.next();

		// check if the ArrayList contains the user's input and print out the result
		if (colors.contains(search)) {
			System.out.println("\t~" + search + " Color Found In ArrayList At Index " + colors.indexOf(search));
		} else {
			System.out.println("\t ~Sorry...! " + search + " Color Not Found In ArrayList");
		}

		// create a new ArrayList called "newcolors" and add all the elements from the
		// "colors" ArrayList
		ArrayList<String> newcolors = new ArrayList<>();
		newcolors.addAll(colors);
		System.out.println("Q7." + newcolors);

		// check if the "colors" ArrayList is equal to the "newcolors" ArrayList and
		// print out the result
		if (colors.equals(newcolors)) {
			System.out.println("Q8. Two ArrayLists Are Equal");
		} else {
			System.out.println("Q8. Two ArrayLists Are Not Equal");
		}
	}
}