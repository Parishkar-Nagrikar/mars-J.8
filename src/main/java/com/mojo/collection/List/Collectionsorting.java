package com.mojo.collection.List;
// Java program to demonstrate working of Collections.sort()
import java.util.*;

public class Collectionsorting {
    public static void main(String[] args){
        // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");

		/* Collections.sort method is sorting the
		elements of ArrayList in ascending order. */
        Collections.sort(al);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + al);

        // Create a list of strings
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Geeks For Geeks");
        al1.add("Friends");
        al1.add("Dear");
        al1.add("Is");
        al1.add("Superb");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al1, Collections.reverseOrder());

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + al1);

    }
}