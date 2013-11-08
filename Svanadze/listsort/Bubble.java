package Svanadze.listsort;

import java.util.List;

public class Bubble {
	public static List<Integer> Sort(List<Integer> myList) {
		int listSize = myList.size();
		int tmp = 0;
		for (int i = 0; i < listSize; i++) {
			for (int j = (listSize - 1); j >= (i + 1); j--) {
				if (myList.get(j) < myList.get(j - 1)) {
					tmp = myList.get(j);
					myList.set(j, myList.get(j - 1));
					myList.set(j - 1, tmp);
				}
			}
		}
		return myList;
	}

}
