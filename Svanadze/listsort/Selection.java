package Svanadze.listsort;

import java.util.List;

public class Selection {
	public static List<Integer> Sort(List<Integer> myList) {
		int listSize = myList.size();
		int j = 0;
		int tmp = 0;
		for (int i = 0; i < listSize; i++) {
			j = i;
			for (int k = i; k < listSize; k++) {
				if (myList.get(j) > myList.get(k)) {
					j = k;
				}
			}
			tmp = myList.get(i);
			myList.set(i, myList.get(j));
			myList.set(j, tmp);
		}
		return myList;
	}
}
