package Svanadze.listsort;

import java.util.List;

public class Insertion {
	public static List<Integer> Sort(List<Integer> myList) {
		int len = myList.size();
		int key = 0;
		int i = 0;
		for (int j = 1; j < len; j++) {
			key = myList.get(j);
			i = j - 1;
			while (i >= 0 && myList.get(i) > key) {
				myList.set(i + 1, myList.get(i));
				i = i - 1;
				myList.set(i + 1, key);
			}
		}
		return myList;
	}

}
