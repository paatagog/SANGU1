package Svanadze.listsort;

import java.util.ArrayList;
import java.util.List;

public class ListSortTest {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		int[] array = { 5, 6, 5, 4, 8, 4, 2, 5, 3, 9, 7, 8, 8, 6, 4, 3, 0, 1 };
		for (int i = 0; i < array.length; i++) {
			myList.add(array[i]);
		}
		System.out.println("Sorted by Selection: " + Selection.Sort(myList));
		System.out.println("Sorted by Insertion: " + Insertion.Sort(myList));
		System.out.println("Sorted by Bubble: " + Bubble.Sort(myList));
	}
}
