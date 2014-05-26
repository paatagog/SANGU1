package lukino.NeuroNetwork;

import java.util.ArrayList;
import java.util.List;

public class test {
  public static void main(String[] a) {

	  ArrayList<String> list = new ArrayList<String>();
    list.add("A");

    ArrayList<String> list2 = (ArrayList<String>) list.clone();

    System.out.println(list);
    System.out.println(list2);

    list.clear();

    System.out.println(list);
    System.out.println(list2);
  }
}