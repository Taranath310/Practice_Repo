package org.java.practise.collection_concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromDataInArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("1");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("3");
        arrayList.add("4");
        System.out.println(arrayList);

        Set<String> set = new HashSet<>(arrayList);
        ArrayList<String> arrayList1 = new ArrayList<>(set);
        System.out.println(arrayList1);


    }
}
